package com.btm.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotTest {
public static void main(String[] args) throws AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@name =\"username\"]")).click();
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_D);
    r.keyPress(KeyEvent.VK_M);
    r.keyPress(KeyEvent.VK_I);
    r.keyPress(KeyEvent.VK_N);
    
    driver.findElement(By.xpath("//input[@name =\"pwd\"]")).click();
    r.keyPress(KeyEvent.VK_M);
    r.keyPress(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_N);
    r.keyPress(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_G);
    r.keyPress(KeyEvent.VK_E);
    r.keyPress(KeyEvent.VK_R);
    
    driver.findElement(By.partialLinkText("Login")).click();
  
}
}
