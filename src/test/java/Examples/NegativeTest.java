package Examples;

import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTest {

private WebDriver driver;
	
	@Before
	
	public void setUp() throws Exception {
		  //String driverPath = "C:\\geckodriver.exe";
		  System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://automationpractice.com/index.php");
			    
	  }
	
	@org.junit.Test
	
	public void Step() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
		
		Select Subject = new Select (driver.findElement(By.id("id_contact")));
		Subject.selectByVisibleText("Webmaster");
		Subject.selectByIndex(2);
		  
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("a@a.com");
		driver.findElement(By.xpath("//*[@id=\"id_order\"]")).sendKeys("Prueba");
		
		 
		 driver.findElement(By.xpath("//*[@id=\"submitMessage\"]")).click();
		 
		 if (driver.getPageSource().contains("The message cannot be blank"))
		 {{
			 System.out.print("The message when the fiel message is missing is correct");}
		 
		 } else {
			 System.out.print("Not Exist");
		 }
		 
		 
	}
}
