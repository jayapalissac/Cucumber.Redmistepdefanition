package com.flipkart.redmistepdefanition;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedmiValidation extends RedmiCommonClass  {
	
	RedmiCommonClass r = new RedmiCommonClass();
//	
//	 Objectclass m =new  Objectclass();
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		
		r.launch();
	  
	}

	@Given("user handle the login")
	public void user_handle_the_login() {
		
		r.log();
	   
	}

	@When("user search mobile")
	public void user_search_mobile() throws Throwable {
		
//		name="redmi mobiles";
		
//     WebElement element  =driver.findElement(By.xpath("//input[@name='q']/parent::div/child::input"));
//		
//	  element.sendKeys("Redmi",Keys.ENTER);
		
		r.search();
	  
	}

	@When("user select the mobile and click add to cart")
	public void user_select_the_mobile_and_click_add_to_cart() throws Throwable {
		
		 r.cart();	 
		
	}	
}