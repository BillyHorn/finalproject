package com.billyhornfinal.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="animals")
public class Animal {
	
	private Integer animalId;
	private String commonName;
	private String scientificName;
	private Food foodId;
	private String infoLink;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="animalid", unique = true, nullable=false)
	public Integer getAnimalId() {
		return animalId;
	}
	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}
	@Column(name="commonname")
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	@Column(name="scientificname")
	public String getScientificName() {
		return scientificName;
	}
	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}
	@ManyToOne(optional=false, targetEntity = Food.class)
	@JoinColumn(name="foodid")
	public Food getFoodId() {
		return foodId;
	}
	public void setFoodId(Food foodId) {
		this.foodId = foodId;
	}
	@Column(name="infolink")
	public String getInfoLink() {
		return infoLink;
	}
	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}

}
