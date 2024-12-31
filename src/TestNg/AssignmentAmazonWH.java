package TestNg;

import java.time.Duration;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssignmentAmazonWH {
	WebDriver driver;
	 @BeforeTest
	  public void set() {
		 driver=new ChromeDriver();
	  }

	
	  @BeforeMethod
	  public void urlloading() {

		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		  driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();

	  }
	  @Test
	  public void test1() throws InterruptedException
	  {  
		  
		  String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	        String actualTitle = driver.getTitle();
	        System.out.println(actualTitle);
	        Assert.assertEquals(actualTitle, expectedTitle);

		  // Locate the search bar
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

	        // Enter the search term
	        searchBox.sendKeys("mobile phone");

	        // Submit the search
	        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	        searchButton.click();
	     // Locate the first mobile link (adjust selector based on Amazon's structure)
	        WebElement firstMobileLink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span"));

	        // Scroll down to the first mobile link using JavaScript Executor
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", firstMobileLink);
	        // Open the first link in a new window
	       String originalWindow = driver.getWindowHandle();
	       
	        firstMobileLink.click(); // Simulate a click

		  System.out.println("parent window title"+driver.getTitle());
		 

		 Set<String>WINDOW2=driver.getWindowHandles();
		 for(String h:WINDOW2)
		 {
			 if(!h.equalsIgnoreCase(originalWindow))
			 {
                 driver.switchTo().window(h);
                 break;
                 }}
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(700)); 
		  

				  WebElement cart=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[5]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input"));
			        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", cart);
			        cart.click();
			        WebElement cart2=driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input"));
			        cart2.click();
	  }
		 
		  
}
