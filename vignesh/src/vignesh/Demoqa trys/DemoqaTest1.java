package com.test.SeliniumDemo2Maven;







import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/books");
    driver.manage().window().maximize();
    
    
    WebElement search = driver.findElement(By.id("searchBox"));
 
    search.sendKeys("Speaking JavaScript");
    System.out.println(driver.findElement(By.id("searchBox")).getAttribute("value"));
   driver.findElement(By.linkText("Speaking JavaScript")).click();
   
  //  System.out.println(driver.findElement(By.xpath("//*[@id=\"userName-value\"]")).getText()+ " ");
    
    
 //   driver.findElement(By.id("login")).click();
   // WebElement userl = driver.findElement(By.id("userName"));
   // userl.sendKeys("vignesh");
  //  driver.findElement(By.id("password")).sendKeys("password");
  //  driver.findElement(By.id("login")).click();
    
   // driver.findElement(By.id("newUser")).click();
  //  WebElement firs = driver.findElement(By.id("firstname"));
  //  firs.sendKeys("vignesh");
  //  WebElement las = driver.findElement(By.id("lastname"));
 //   las.sendKeys("Balakrishnan");
  //  WebElement una = driver.findElement(By.id("userName"));
 //   una.sendKeys("vicky");
  //  WebElement psd = driver.findElement(By.id("password"));
  //  psd.sendKeys("vignesh");
  //  driver.findElement(By.id("register")).click();
    
    
    
    
    
        
    
  // search.submit();
 //   driver.findElement(By.linkText("Git Pocket Guide")).click();
 //   driver.findElement(By.id("see-book-Git Pocket Guide")).click();
    
     
   
    
    
    
    
}
	
}
