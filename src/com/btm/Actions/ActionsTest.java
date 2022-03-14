package com.btm.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {
public static void main(String[] args) {
	System.out.println("check 0");
	WebDriverManager.chromedriver().setup();
	System.out.println("check 1");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name =\"username\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name =\"pwd\"]")).sendKeys("manager");
	WebElement target = driver.findElement(By.xpath("//a[@id =\"loginButton\"]"));
	
	Actions a = new Actions(driver);
	System.out.println("check 2");
	a.click(target).perform();
 
    
	
}
}
