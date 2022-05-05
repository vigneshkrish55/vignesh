package vignesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDemo {
	public void testf()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    WebElement search = driver.findElement(By.name("q"));
	    search.sendKeys("mobile");
	    search.submit();
	}


}
