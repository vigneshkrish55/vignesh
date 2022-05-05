package com.test.SeliniumDemo2Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestng {
	
	public void tesT()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.snapdeal.com/");
    driver.manage().window().maximize();
    WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
     search.sendKeys("mobile");
    search.submit();
		

	}
	

}
