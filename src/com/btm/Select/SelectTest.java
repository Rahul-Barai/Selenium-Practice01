package com.btm.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTest {
public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("file://D://Testing//Selenium//Selenium-Basics//data//selectoption.html");
WebElement element = driver.findElement(By.id("mtr"));
Select select = new Select(element);	
List<WebElement> elements = select.getOptions();
select.selectByIndex(0);
select.selectByValue("v");
}
}
