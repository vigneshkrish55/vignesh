package com.test.SeliniumDemo2Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MainTest 
{
    public WebDriver driver;
    
    @BeforeTest
    public void open() {
    
    	System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://demoqa.com/books");
	   //driver.manage().window().maximize();
}
    @AfterTest
    public void pageclose()
    {
    	driver.close();
    	
    }
}