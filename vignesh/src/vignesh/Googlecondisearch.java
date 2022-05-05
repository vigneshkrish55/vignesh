package com.test.SeliniumDemo2Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlecondisearch {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		 WebDriver driver = new  ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.name("q")).sendKeys("java");
		 
		 Thread.sleep(10000);
		 
		 List <WebElement > list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='']"));
		 System.out.println(list.size());
		 
		 for(int i=0;i<list.size();i++)
		 {
			 String listitem=list.get(i).getText();
			 
			 System.out.println(listitem);
			 if(listitem.contains("java tutorial"))
			 {
				 list.get(i).click();
				 break;
				 
			 }
		 }
		 

	}

}
