package com.flipkart.redmiResource;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class RedmiCommonActions {
	
     public static WebDriver driver;
	
	
	public void launch(String url) {
		
     WebDriverManager.chromedriver().setup();  
	   
     driver=new ChromeDriver();
	    
     driver.navigate().to(url);
	    
     driver.manage().window().maximize();
	  
	}
	
	public void insertText(WebElement name ,String value) {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		name.sendKeys(value,Keys.ENTER);
	}
	
	public void windowsHandling() {
		
		WebElement mob=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
		mob.click();
		
     Set<String> child=driver.getWindowHandles();
		
		List<String> name = new ArrayList<>(child);
		
		driver.switchTo().window(name.get(1));
		
		WebElement mobname=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		
	      String text=	mobname.getText();
	
	System.out.println(text);
	}
	
	public void scrollDown() {
		
 WebElement down =driver.findElement(By.xpath("//div[text()='Specifications']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		
		
	}
	
    public void screenShot() throws Throwable {
    	
TakesScreenshot tk = (TakesScreenshot)driver;
		
		File ip=tk.getScreenshotAs(OutputType.FILE);
		
		File out =new File("C:\\Users\\AR\\eclipse-workspace\\Cucumbersep\\src\\test\\resources/Redmi");
		
		FileUtils.copyFile(ip,out);
		
		driver.quit();
		
		
	}


}


}
