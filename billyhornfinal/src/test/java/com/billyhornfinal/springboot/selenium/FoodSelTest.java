package com.billyhornfinal.springboot.selenium;

import org.openqa.selenium.WebDriver;

public class FoodSelTest {
	private WebDriver driver;
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public void test(){
		driver.get("/");
	}

}
