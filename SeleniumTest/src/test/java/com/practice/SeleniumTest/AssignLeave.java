package com.practice.SeleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignLeave extends testbase{
	
	@Test
	public void Assignleave()throws InterruptedException, AWTException{
    //driver
	//driver.switchTo().window(parent);
    WebElement MyShortcuts1=driver.findElement(By.xpath("//*[@id='shortcut-menu-trigger']/span[2]"));
    MyShortcuts1.click();
    WebElement AssignLeave=driver.findElement(By.xpath("//*[@id='shortcut_menu']/li[2]/a"));
    Assert.assertTrue(true);
    AssignLeave.click();
    /*WebElement MyShortcuts2=driver.findElement(By.xpath("//*[@id='shortcut-menu-trigger']/span[2]"));
    MyShortcuts2.click();
    WebElement LeaveList=driver.findElement(By.xpath("//*[@id='shortcut_menu']/li[3]/a"));
    LeaveList.click();*/
 
    	Thread.sleep(5000);

     WebElement employee=driver.findElement(By.xpath("//*[@id='employee_value']"));
     employee.sendKeys("Joe Root");
     Thread.sleep(5000);
     (driver.findElement(By.xpath("//*[@id='leaveType_inputfileddiv']/div/input"))).click();
     Thread.sleep(2000);
     Robot robot = new Robot();
     robot.keyPress(KeyEvent.VK_C);
     robot.keyPress(KeyEvent.VK_ENTER);
     Thread.sleep(5000);
     (driver.findElement(By.xpath("//*[@id='applyLeaveForm']/div[1]/materializecss-decorator[1]/div/sf-decorator[3]/div/a"))).click();
     Thread.sleep(3000);
     (driver.findElement(By.xpath("//*[@id='application_balance_modal']/div[3]/div/a[2]"))).click();
     Thread.sleep(3000);
     String leave = driver.findElement(By.xpath("//*[@id='application_balance_modal']/div[2]/div/crud-panel/div/div/list/table/tbody/tr[1]/td[1]")).getText();
     System.out.println("Total Leaves are"+ leave);
     driver.findElement(By.xpath("//*[@id='application_balance_modal']/div[3]/div/a[1]")).click();
     Thread.sleep(3000);
     WebElement fromDate = driver.findElement(By.xpath("//*[@id='from']"));
     fromDate.sendKeys("Tue, 29 Dec 2020");
     driver.findElement(By.xpath("//*[@id='to']")).click();
     driver.findElement(By.xpath("//*[@id='comment']")).sendKeys("testing");
     driver.findElement(By.xpath("//*[@id='applyLeaveForm']/div[2]/div/button")).click();
     
     }
	}


 
   



