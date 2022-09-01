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
import org.openqa.selenium.Dimension;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testExamples {

private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	   
	    driver.manage().window().maximize();
	    driver.get("http://automationpractice.com/index.php");
	    
	    // specific width (Show Iphone X emulator)
        Dimension size = new Dimension(375,812);
        driver.manage().window().setSize(size);
        
        
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
		
		 driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Prueba");
		 driver.findElement(By.xpath("//*[@id=\"submitMessage\"]")).click();
		 
		 if (driver.getPageSource().contains("Your message has been successfully sent to our team"))
		 {{
			 System.out.print("The message is correct");}
		 
		 } else {
			 System.out.print("Not Exist");
		 }
		 
		 driver.quit();
	}
	
	
	
}
