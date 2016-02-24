package com.billyhornfinal.springboot.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.billyhornfinal.springboot.daos.CategoryDao;
import com.billyhornfinal.springboot.models.Category;

/**
 * The hibernate functionality for the category table's Database access
 * @author bhorn
 *
 */

@Transactional
@Component
public class CategoryDaoHibernate implements CategoryDao{
	
	@PersistenceContext
	private EntityManager em;

	/**
	 * Sets the entity manager
	 * @param em
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	/**
	 * Returns a list of all rows from the category table in the database
	 */
	public List<Category> getAllCategories() {
		return em
				.createQuery("SELECT category FROM Category category", Category.class)
				.getResultList();
	}

	/**
	 * Returns a single row from the categories table in the database
	 * @param categoryId
	 */
	public Category getCategoryById(Integer categoryId) {
		return em
				.createQuery("SELECT category FROM Category category WHERE category.categoryId = :id", Category.class)
				.setParameter("id",  categoryId)
				.getSingleResult();
	}

}
