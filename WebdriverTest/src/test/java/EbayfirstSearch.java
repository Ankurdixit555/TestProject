
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class EbayfirstSearch
{
  private WebDriver driver;

  @Test
  public void f()
  {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	    driver.findElement(By.id("gh-ac")).click();
	    driver.findElement(By.id("gh-ac")).clear();
	    driver.findElement(By.id("gh-ac")).sendKeys("1 TB storage capacity");
	    driver.findElement(By.id("gh-btn")).click();
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     
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
  System.out.println("This is the End of TestNG Ebay Program");
  
  }

}
