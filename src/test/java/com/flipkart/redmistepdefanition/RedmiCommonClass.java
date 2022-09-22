package com.flipkart.redmistepdefanition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedmiCommonClass  {
	
	public static WebDriver driver;

     //RedmiCommonClass r = new RedmiCommonClass();

	// Objectclass m =new  Objectclass();
	
	
   public void launch() {
	   
	   WebDriverManager.chromedriver().setup();  
	   
	     driver=new ChromeDriver();
		    
	     driver.navigate().to("https://www.flipkart.com/");
		    
	     driver.manage().window().maximize();
		  
		
  }
   
   public void log() {
	   
	   WebElement log=driver.findElement(By.xpath("//button[text()='✕']/parent::div/child::button"));
		
	// m.getLog().click();
	   
	log.click();
		
   }
 	
   public void search() throws Throwable {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
		//name="";
		
	    WebElement element  =driver.findElement(By.xpath("//input[@name='q']/parent::div/child::input"));
			
		//m.getElement().sendKeys("redmi mobiles",Keys.ENTER);
	   
	   element. sendKeys("redmi mobiles",Keys.ENTER);
	   
	  // Thread.sleep(3000);
		
	  //WebElement element  =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	   
//	  element.sendKeys(value,Keys.ENTER);
	  
		 
//			 m.getElement1().click();
		  
		//  element.click();
	   
	   WebElement element1  =driver.findElement(By.xpath("(//div[@class='_4rR01T']/parent::div/child::div)[1]"));
		 
	   element1.click();
		
   }
   
   public void cart() throws Throwable {
	   
	 
		
	  Thread.sleep(2000);
	  
    Set<String> child=driver.getWindowHandles();
		
		List<String> name = new ArrayList<>(child);
		
		driver.switchTo().window(name.get(1));
		
		
		//boolean b=
		 
		
		WebElement down =driver.findElement(By.xpath("(//div[@class='_5pFuey']//parent::div/child::div)[1]"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		Thread.sleep(3000);
	
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
		
		WebElement add =driver.findElement(By.xpath("//button/parent::li/child::button"));
		
//		m.getAdd().click();
		
		add.click();
		
		
   WebElement model =driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']/parent::div/child::a"));
		
		String s2 = model.getText();
		
		System.out.println(s2);
		
		
		List<WebElement> order=driver.findElements(By.xpath("//div[@class='_35mLK5']/parent::div"));
		
		//m.getOrder().getSize();
		
		order.size();
		
		//System.out.println(order.size());
		
	for(int i =0;i<order.size();i++) {
//			
//			
		WebElement size=order.get(i);
//			
		String s = size.getText();
			System.out.println(s);
	}
//		  
		
		Thread.sleep(3000);
		
		 WebElement date  =driver.findElement(By.xpath("//div[@class='_2pqhhf']/parent::li/child::div"));
		 
		 String del=date.getText();
		 
		 System.out.println(del);
		  
		// String delivery=m.getDate().getText();
		 
		// System.out.println(delivery);
		 

		 WebElement pincode=driver.findElement(By.xpath("//button[@class='_2MMH-I']/parent::div/child::button"));
		 
		// m.getPincode().click();
		 
		 pincode.click();
		 
		 
		 WebElement code =driver.findElement(By.xpath("//input[@type='TEXT']/parent::div/child::input"));
		 
		//m.getCode().sendKeys("1234567",Keys.ENTER);
		 
		 code.sendKeys("1234567",Keys.ENTER);	 		
   }
     }
