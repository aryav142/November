package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOBfacebook {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	}
	@Test
	public void test()
	{ WebElement day= driver.findElement(By.xpath("//*[@id=\"day\"]"));
	  Select daydrop=new Select(day);
	  //daydrop.selectByValue("12");
	  daydrop.selectByIndex(9);
	  WebElement month= driver.findElement(By.xpath("//*[@id=\"month\"]"));
	  Select monthdrop=new Select(month);
	  monthdrop.selectByIndex(3);
	  WebElement year= driver.findElement(By.xpath("//*[@id=\"year\"]"));
	  Select yeardrop=new Select(year);
	  yeardrop.selectByIndex(3);
	  
	  
	  
	}


  }
