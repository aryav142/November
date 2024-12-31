package Selenium_program;



import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSRediff {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver() ;
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void screenshot() throws IOException
	
	{ WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,  new File("./Screenshott//Elementscreenshot1.png"));
}
}



