package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dargddrop {
	WebDriver driver;
	 @BeforeTest
	  public void set() {
		 driver=new ChromeDriver();
	  }

	
	  @BeforeMethod
	  public void urlloading() {
		  driver.get("https://demoqa.com/droppable");
	  }
	  @Test
	  public void test1()  {
		

	  
		 WebElement drag= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		 WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 driver.manage().window().maximize();
		 Actions act = new Actions(driver);
	        act.dragAndDrop(drag, drop).perform();
	        String d=drop.getText();
	        if(d.equals("Dropped!"))
	        {
	        	System.out.println("Dropped successfully");
	        	
	        }
	        else
	        {
	        	System.out.println("Not dropped");
	        }
	  }}

