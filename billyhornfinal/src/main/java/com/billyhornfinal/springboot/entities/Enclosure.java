package com.billyhornfinal.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Enclosure entity to match database table
 * @author bhorn
 *
 */
@Entity
@Table(name="enclosures")
public class Enclosure {
	
	private Integer enclosureId;
	private String enclosureName;
	private Integer animalAmount;
	private String feedingTime;
	private String condition;
	private Animal animalId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="enclosureid", unique=true, nullable=false)
	public Integer getEnclosureId(){
		return enclosureId;
	}
	
	public void setEnclosureId(Integer enclosureId){
		this.enclosureId = enclosureId;
	}

	@Column(name="enclosurename")
	public String getEnclosureName() {
		return enclosureName;
	}

	public void setEnclosureName(String enclosureName) {
		this.enclosureName = enclosureName;
	}

	@Column(name="animalamount")
	public Integer getAnimalAmount() {
		return animalAmount;
	}

	public void setAnimalAmount(Integer animalAmount) {
		this.animalAmount = animalAmount;
	}

	@Column(name="feedingtime")
	public String getFeedingTime() {
		return feedingTime;
	}

	public void setFeedingTime(String feedingTime) {
		this.feedingTime = feedingTime;
	}

	@Column(name="condition")
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * Joins the enclosure and animal table
	 * @return
	 */
	@ManyToOne(optional=false, targetEntity = Animal.class)
	@JoinColumn(name="animalid")
	public Animal getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Animal animalId) {
		this.animalId = animalId;
	}

}
