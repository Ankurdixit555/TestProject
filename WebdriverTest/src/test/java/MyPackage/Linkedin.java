package MyPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Linkedin
{

	
	private WebDriver driver;

	  @Test
	  public void f()
	  {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://www.linkedin.com/");
	        driver.findElement(By.linkText("Sign in")).click();
		 
		     
	  }
	 
	  
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\DriverList\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	  }

	  @AfterTest
	  public void afterTest() 
	  {
	      
	  driver.quit();  
	  System.out.println("This is the End of TestNG Linkedin Program");
	  
	  }

	
	
	
	
	
	
	
	
	
	
	
	
}
