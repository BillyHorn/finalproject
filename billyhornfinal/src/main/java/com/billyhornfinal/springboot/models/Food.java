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
 * model for food objects
 * @author bhorn
 *
 */

@Entity
@Table(name = "food")
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "foodid")
	private Integer foodId;	// this id not displayed to user
	
	@NotNull
	@Size(min=1,max=255)
	@Column(name = "foodname")
	private String foodname;

	@NotNull
	@Size(min=1,max=255)
	@Column(name = "vendor")
	private String vendor;
	
	@NotNull
	@Column(name = "category")
	private Integer category;
	
	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	
	public String getFoodName() {
		return foodname;
	}

	public void setFoodName(String foodname) {
		this.foodname = foodname;
	}
	
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	
	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}
	
}
