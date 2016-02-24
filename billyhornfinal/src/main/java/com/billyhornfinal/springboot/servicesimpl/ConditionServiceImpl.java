package com.billyhornfinal.springboot.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billyhornfinal.springboot.daos.ConditionDao;
import com.billyhornfinal.springboot.models.Condition;
import com.billyhornfinal.springboot.services.ConditionService;
import com.billyhornfinal.springboot.services.InvalidInputException;

/**
 * The methods declared in this implementation provide basic WebService functionality 
 * @author bhorn
 *
 */
@Service
public class ConditionServiceImpl implements ConditionService{

	@Autowired
	private ConditionDao conditionDao;
	
	/**
	 * Sets the conditionDao object
	 * @param conditionDao
	 */
	public void setconditionDao(ConditionDao conditionDao) {
		this.conditionDao = conditionDao;
	}
	
	/**
	 * Retrieve all conditions from the application.
	 * @return
	 */
	public List<Condition> getConditions() {
		List<Condition> conditions = conditionDao.getAllConditions();
		return conditions;
	}

	/**
	 * Retrieve a single condition's information if that condition's conditionId
	 * matches the supplied conditionId
	 * @param conditionId
	 * @return
	 * @throws InvalidInputException
	 *             - the value of conditionId provided should not be null or less
	 *             than 0
	 */
	public Condition getByConditionId(Integer conditionId) throws InvalidInputException {
		if (conditionId == null || conditionId < 0) {
			throw new InvalidInputException("conditionId.NullOrNegative");
		}
		return conditionDao.getConditionById(conditionId);
	}

}
