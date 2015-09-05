package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomePage {
	private WebDriver driver;
	
  @Test
  public void clickDemoLink() throws InterruptedException {	  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.opencart.com/");
	  
	  String sHomePageTitle = driver.getTitle();
	  System.out.println(sHomePageTitle);
	  
	  driver.findElement(By.linkText("Demo")).click();
	  Thread.sleep(3000);
	  
	  String sDemoPageTitle = driver.getTitle();
	  System.out.println(sDemoPageTitle);
	  
	  
	  
	  driver.quit();
  }
  
  
}
