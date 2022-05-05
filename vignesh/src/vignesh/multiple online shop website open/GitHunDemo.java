package vignesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHunDemo {
	
	public void testd()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("Dress");
	    search.submit();
	}

}
