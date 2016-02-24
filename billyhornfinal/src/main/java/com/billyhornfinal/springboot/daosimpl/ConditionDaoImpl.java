package com.billyhornfinal.springboot.daosimpl;

import java.util.ArrayList;
import java.util.List;

import com.billyhornfinal.springboot.daos.ConditionDao;
import com.billyhornfinal.springboot.models.Condition;

public class ConditionDaoImpl implements ConditionDao{

	private List<Condition> conditions = new ArrayList<Condition>();
	
	/**
	 * Method returns list of all Conditions
	 * @return getAllConditions
	 */
	public List<Condition> getAllConditions() {
		return conditions;
	}

	/**
	 * Method returns single Condition with 
	 * @param conditionId
	 * @return Condition
	 */
	public Condition getConditionById(Integer conditionId) {
		for(Condition c : conditions){
			if(c.getConditionId().equals(conditionId)){
				return c;
			}
		}
		return null;
	}

}
