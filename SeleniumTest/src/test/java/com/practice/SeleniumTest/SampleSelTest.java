package com.practice.SeleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleSelTest extends testbase {

@Test
public void orange()throws InterruptedException, AWTException{
WebElement MyShortcuts=driver.findElement(By.xpath("//*[@id='shortcut-menu-trigger']/span[2]"));
MyShortcuts.click();
//Click on OrangeBuzz
WebElement OrangeBuzz=driver.findElement(By.xpath("//*[@id='shortcut_menu']/li[1]/a"));
OrangeBuzz.click();
//Write status
//Thread.sleep(20000);
//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);       
String parent = driver.getWindowHandle();
Set<String> allWindows=driver.getWindowHandles();
for(String child:allWindows)
{
	  if(!parent.equalsIgnoreCase(child))
	  {
		  driver.switchTo().window(child);
		  driver.findElement (By.xpath("//*[@id='createPost_content']")).sendKeys("Walkthrough @7");
		  Thread.sleep(2000);
	  }
}
driver.findElement(By.id("postSubmitBtn")).click();
driver.findElement(By.id("tabLink2")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='image-upload-button']")).click();
Thread.sleep(3000);
StringSelection selection = new StringSelection("C:\\Users\\Hp-pc\\Downloads\\Robot.jpg");
Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
clipboard.setContents(selection, selection);
Robot robot = new Robot();
	
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(5000);
driver.close();	
}
}

