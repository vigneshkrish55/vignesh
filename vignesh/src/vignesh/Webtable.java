package com.test.SeliniumDemo2Maven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public  void demoqa(WebDriver driver) 
	{
		
		
		  String url = driver.getCurrentUrl();
		   // String pagesource = driver.getPageSource();
		   
		    String pageTitle = driver.getTitle();
		    
		    String windowHandle = driver.getWindowHandle();
		    Set<String> window =  driver.getWindowHandles();
		    
		    
		    System.out.println("URL IS :-"+ url);
		   // System.out.println("pagesource is "+ pagesource);
		    
		    System.out.println("pagetitle is :-"+ pageTitle);
		    
		    System.out.println("windowHandle is :-"+ windowHandle);
		    System.out.println("window is :-"+ window);
		    
		   // driver.findElement(By.linkText("Speaking JavaScript")).click();
		    
		   // driver.get("https://demoqa.com/books");
		    
		    WebElement sear = driver.findElement(By.id("searchBox")); 
		    boolean searchtag = sear.isDisplayed();
		    System.out.println("search bar is presents is:-"+ searchtag);
		   
		    
		    WebElement log = driver.findElement(By.id("login"));
		    boolean loginbut = log.isDisplayed();
		    System.out.println("Login Button is presents is:-"+ loginbut);
	    
		    Dimension rowcount = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]")).getSize();
		    System.out.println("number of rows & columns :-" + rowcount);
		    
		    
		    
		    WebElement image= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/img"));
		    boolean imahetag = image.isDisplayed();
		    System.out.println("image tag is presents is:-"+ imahetag);
		    
		    
		    
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div")).getText()+ " ");
		   
		   
	  
	   // WebElement low = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]"));
	   // low.sendKeys("Book Store Application");
	   // low.submit();
	    
	   
	     }
	
	public void search() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		  WebDriver driver1 = new ChromeDriver();
		  driver1.get("https://demoqa.com/books");
		 WebElement search = driver1.findElement(By.id("searchBox"));
		    
		    System.out.println("*****************************FINDING A BOOK AVAILABLES*************************************");
		    search.sendKeys("Speaking JavaScript");
		    System.out.println(driver1.findElement(By.id("searchBox")).getAttribute("value"));
		    search.clear();
		    
		 WebElement sea = driver1.findElement(By.id("searchBox"));
		 
		    sea.sendKeys("You Don't Know JS");
		    System.out.println(driver1.findElement(By.id("searchBox")).getAttribute("value"));
		    
	}

}
