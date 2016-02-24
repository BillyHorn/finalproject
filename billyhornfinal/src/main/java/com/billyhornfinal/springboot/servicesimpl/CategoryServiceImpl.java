package com.billyhornfinal.springboot.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billyhornfinal.springboot.daos.CategoryDao;
import com.billyhornfinal.springboot.models.Category;
import com.billyhornfinal.springboot.services.CategoryService;
import com.billyhornfinal.springboot.services.InvalidInputException;

/**
 * The methods declared in this implementation provide basic WebService functionality 
 * @author bhorn
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	/**
	 * Sets the categoryDao object
	 * @param categoryDao
	 */
	public void setcategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
	
	/**
	 * Retrieve all categories from the application.
	 * @return
	 */
	public List<Category> getCategories() {
		List<Category> categories = categoryDao.getAllCategories();
		return categories;
	}

	/**
	 * Retrieve a single category's information if that category's categoryId
	 * matches the supplied categoryId
	 * @param categoryId
	 * @return
	 * @throws InvalidInputException
	 *             - the value of categoryId provided should not be null or less
	 *             than 0
	 */
	public Category getByCategoryId(Integer categoryId) throws InvalidInputException {
		if (categoryId == null || categoryId < 0) {
			throw new InvalidInputException("categoryId.NullOrNegative");
		}
		return categoryDao.getCategoryById(categoryId);
	}

}
