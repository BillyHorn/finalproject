package com.billyhornfinal.springboot.daosimpl;

import java.util.ArrayList;
import java.util.List;

import com.billyhornfinal.springboot.daos.CategoryDao;
import com.billyhornfinal.springboot.models.Category;

/**
 * The following Hibernate commands connect CategoryDao Java to the database.
 * @author bhorn
 *
 */
public class CategoryDaoImpl implements CategoryDao{

	private List<Category> categories = new ArrayList<Category>();
	
	/**
	 * Method returns list of all Categories
	 * @return getAllCategories
	 */
	public List<Category> getAllCategories() {
		return categories;
	}

	/**
	 * Method returns single Category with 
	 * @param categoryId
	 * @return Category
	 */
	public Category getCategoryById(Integer categoryId) {
		for(Category c : categories){
			if(c.getCategoryId().equals(categoryId)){
				return c;
			}
		}
		return null;
	}

}
