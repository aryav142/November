package Selenium_program;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotRediff {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver() ;
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void scrnshot() throws IOException
	
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src,new File("C://error7.png"));
		FileHandler.copy(src,new File("C:\\Users\\Arya Venugopal\\OneDrive\\Desktop//error7.png"));
	}
}
