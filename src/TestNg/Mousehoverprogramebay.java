package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehoverprogramebay {
	WebDriver driver;
	 @BeforeTest
	  public void set() {
		 driver=new ChromeDriver();
	  }

	
	  @BeforeMethod
	  public void urlloading() {
		  driver.get("https://www.ebay.com/");
	  }
	  @Test
	  public void test1()  {
		

	   //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit timer
		 WebElement electronics= driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		 driver.manage().window().maximize();
		 Actions act = new Actions(driver);
		 act.moveToElement(electronics);
		 act.perform();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		 //explicit timer
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		 WebElement smartphn=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
         smartphn.click();
}}
