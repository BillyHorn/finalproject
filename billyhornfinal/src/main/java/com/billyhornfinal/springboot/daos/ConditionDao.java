package com.billyhornfinal.springboot.daos;

import java.util.List;

import com.billyhornfinal.springboot.models.Condition;

public interface ConditionDao {
	
	/**
	 * Gets a list of all categories
	 * @return
	 */
	List<Condition> getAllConditions();
	
	/**
	 * Gets a single category by ID
	 * @param categoryId
	 * @return
	 */
	Condition getConditionById(Integer conditionId);

}
