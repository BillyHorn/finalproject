package com.billyhornfinal.springboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.billyhornfinal.springboot.entities.Animal;
import com.billyhornfinal.springboot.entities.Food;
import com.billyhornfinal.springboot.service.FoodService;
import com.billyhornfinal.springboot.service.InvalidInputException;
import com.billyhornfinal.springboot.services.impl.AnimalServiceImpl;
import com.billyhornfinal.springboot.services.impl.FoodServiceImpl;

@RestController
public class FoodWebService {
	
	@Autowired 
	FoodService foodService;
	
	/**
	 * @param foodService the foodService to set
	 */
	public void setFoodService(FoodServiceImpl foodService) {
		this.foodService = foodService;
	}
	
	@RequestMapping(value="/food", method=RequestMethod.POST)
	public void addFood(@RequestBody Food food){
		foodService.add(food);
	}
	
	@RequestMapping(value="/foods", method=RequestMethod.GET)
	public List<Food> getFoods(){
		return foodService.getFoods();
	}
	
	@RequestMapping(value="/food/{id}", method = RequestMethod.PUT)
	public void updateFood(@PathVariable Integer id, @RequestBody Food food){
		foodService.update(food);
	}
	
	@RequestMapping(value="/food/{id}", method=RequestMethod.GET)
	public Food getFoodByID(@PathVariable Integer id) throws InvalidInputException{ 
		return foodService.getByFoodId(id);
	}

}
