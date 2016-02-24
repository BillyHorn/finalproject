package com.billyhornfinal.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * model for condition object
 * @author bhorn
 *
 */

@Entity
@Table(name="conditionlu")
public class Condition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "conditionid")
	private Integer  conditionId;
	
	@NotNull
	@Column(name = "condition")
	private String condition;
	
	public Integer getConditionId() {
		return conditionId;
	}
	public void setConditionId(Integer conditionId) {
		this.conditionId = conditionId;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	public String toString() {
		return "Condition [getConditionId()=" + getConditionId() + ", getCondition()="
				+ getCondition() + "]";
	}

}
