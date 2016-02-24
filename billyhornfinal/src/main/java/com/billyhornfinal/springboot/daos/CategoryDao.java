package com.billyhornfinal.springboot.daos;

import java.util.List;

import com.billyhornfinal.springboot.models.Category;

public interface CategoryDao {
	
	/**
	 * Gets a list of all categories
	 * @return
	 */
	List<Category> getAllCategories();
	
	/**
	 * Gets a single category by ID
	 * @param categoryId
	 * @return
	 */
	Category getCategoryById(Integer categoryId);
	
}
