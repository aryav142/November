package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRediffProgram {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		
		
		Boolean b=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(b)
		{
			System.out.println("Title Displayed");
		}
		else
		{
			System.out.println("Title Not Displayed");
		}
		Boolean b1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(b1)
		{
			System.out.println("Checkbox selected");
			
		}
		else
		{
			System.out.println("Checkbox not selected");
		}
		Boolean b2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(b2)
		{
			System.out.println("Radiobutton selected");
			
		}
		else
		{
			System.out.println("Radiobutton not selected");
		}
}}
