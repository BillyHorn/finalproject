package com.billyhornfinal.springboot.models;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Model for enclosure objects
 * @author bhorn
 *
 */

@Entity
@Table(name = "enclosure")
public class Enclosure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enclosureid")
	private Integer enclosureId;	// this id not displayed to user
	
	@NotNull
	@Size(min=1,max=255)
	@Column(name = "enclosurename")
	private String enclosurename;
	
	@NotNull
	@Column(name = "animalamount")
	private Integer animalamount;
	
	@NotNull
	@Column(name = "animal")
	private Integer animal;
	
	@NotNull
	@Column(name = "feedingtime")
	private Time feedingtime;
	
	@NotNull
	@Column(name = "condition")
	private Integer condition;

	public Integer getEnclosureId() {
		return enclosureId;
	}

	public void setEnclosureId(Integer enclosureId) {
		this.enclosureId = enclosureId;
	}
	
	public String getEnclosureName() {
		return enclosurename;
	}

	public void setEnclosureName(String enclosurename) {
		this.enclosurename = enclosurename;
	}
	
	public Integer getAnimalAmount() {
		return animalamount;
	}

	public void setAnimalAmount(Integer animalamount) {
		this.animalamount = animalamount;
	}
	
	public Time getFeedingTime() {
		return feedingtime;
	}

	public void setFeedingTime(Time feedingtime) {
		this.feedingtime = feedingtime;
	}
	
	public Integer getAnimal() {
		return animal;
	}

	public void setAnimal(Integer animal) {
		this.animal = animal;
	}
	
	public Integer getCondition() {
		return condition;
	}

	public void setCondition(Integer condition) {
		this.condition = condition;
	}
}
