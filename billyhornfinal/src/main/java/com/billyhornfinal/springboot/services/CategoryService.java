package com.billyhornfinal.springboot.services;

import java.util.List;

import com.billyhornfinal.springboot.models.Category;

/**
 * The methods declared in this interface are to provide 
 * basic WebService functionality 
 * @author bhorn
 *
 */
public interface CategoryService {

	/**
	 * Retrieve a list of all categories
	 * @return
	 */
	List<Category> getCategories();
	
	/**
	 * Retrieve a single category
	 * @param categoryId
	 * @return
	 * @throws InvalidInputException
	 */
	Category getByCategoryId(Integer categoryId) throws InvalidInputException;
	
}
