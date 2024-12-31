package TestNg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gururightdoubleclick {
	WebDriver driver;
	 @BeforeTest
	  public void set() {
		 driver=new ChromeDriver();
	  }

	
	  @BeforeMethod
	  public void urlloading() {
		  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  }
	  @Test
	  public void test1()  {
		

	  
		 WebElement right= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	      
		  Actions act=new Actions(driver);
		//  act.contextClick(right).perform();
		  act.contextClick(right);
		  act.perform();
		  driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[7]/span")).click();
			
          
		  //driver.switchTo().alert().accept();
		  Alert a= driver.switchTo().alert();
		  System.out.println(a.getText());
		  a.accept();
		 WebElement doublec=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		 act.doubleClick(doublec).perform();
			 
			 //driver.switchTo().alert().accept();
		 Alert b=driver.switchTo().alert();
		 System.out.println(b.getText());
		 b.accept();

		  

}}
