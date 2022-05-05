package com.test.SeliniumDemo2Maven;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlpage {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/books");
	    
		 
		    String url = driver.getCurrentUrl();
		    String pagesource = driver.getPageSource();
		    String pageTitle = driver.getTitle();
		    String windowHandle = driver.getWindowHandle();
		    Set<String> window =  driver.getWindowHandles();
		    
		    System.out.println("URL IS "+ url);
		    System.out.println("pagesource is "+ pagesource);
		    System.out.println("pagetitle is "+ pageTitle);
		    System.out.println("windowHandle is "+ windowHandle);
		    System.out.println("window is "+ window);
		    
	}

}
