package com.practice.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testbase {


public WebDriver driver;
@BeforeTest	
	public void testmethod() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://akki12-trials70.orangehrmlive.com");
	Thread.sleep(4000);
	WebElement username=driver.findElement(By.id("txtUsername"));
	  username.sendKeys("Admin");
	  WebElement password = driver.findElement(By.id("txtPassword"));
	  password.sendKeys("5L@4jBeGQv");
	  Thread.sleep(2000);
	  WebElement button=driver.findElement(By.id("btnLogin"));
	  button.click();
	}
	  
	  @AfterTest
	  public void close(){
		  driver.quit();
	  }
	
	
	
	
}



