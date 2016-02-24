package com.billyhornfinal.springboot.services;

import java.util.List;

import com.billyhornfinal.springboot.models.Condition;

/**
 * The methods declared in this interface are to provide 
 * basic WebService functionality 
 * @author bhorn
 *
 */
public interface ConditionService {
	
	/**
	 * Retrieve a list of all conditions
	 * @return
	 */
	List<Condition> getConditions();
	
	/**
	 * Retrieve a single condition
	 * @param conditionId
	 * @return
	 * @throws InvalidInputException
	 */
	Condition getByConditionId(Integer conditionId) throws InvalidInputException;

}
