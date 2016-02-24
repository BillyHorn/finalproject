package com.billyhornfinal.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * model for animal objects
 * @author bhorn
 *
 */

@Entity
@Table(name = "enclosure")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "animalid")
	private Integer animalId;	// this id not displayed to user
	
	@NotNull
	@Size(min=1,max=255)
	@Column(name = "commonname")
	private String commonname;
	
	@NotNull
	@Size(min=1,max=255)
	@Column(name = "scientificname")
	private String scientificname;
	
	@NotNull
	@Column(name = "food")
	private Integer food;
	
	@NotNull
	@Column(name = "infolink")
	private String infolink;

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}
	
	public String getCommonName() {
		return commonname;
	}

	public void setCommonName(String commonname) {
		this.commonname = commonname;
	}
	
	public String getScientificName() {
		return scientificname;
	}

	public void setScientificName(String scientificname) {
		this.scientificname = scientificname;
	}
	
	public Integer getFood() {
		return food;
	}

	public void setFood(Integer food) {
		this.food = food;
	}
	
	public String getInfoLink() {
		return infolink;
	}

	public void setInfoLink(String infolink) {
		this.infolink = infolink;
	}
	
}
