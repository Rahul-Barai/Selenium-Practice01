package com.btm.JavaScriptExecutor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiabledElementHandleTest {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	String val = "manager";
	driver.get("file:D:\\Testing\\Selenium\\Selenium-pratice-01\\data\\DisabledElements.html");
	JavascriptExecutor java = (JavascriptExecutor) driver; 
	java.executeScript("document.getElementById('un').value='"+val+"'");
}	

}
