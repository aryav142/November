package Selenium_program;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countdaymonthyearrediff {
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
	   WebElement daydrop=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(daydrop);
		day.selectByValue("04");
		List<WebElement> ob=day.getOptions();
		System.out.println(ob.size());
		WebElement monthdrop=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(monthdrop);
		month.selectByValue("07");
		List <WebElement> ob1=month.getOptions();
		System.out.println(ob1.size());
		WebElement yeardrop=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(yeardrop);
		year.selectByValue("2020");
		List <WebElement> ob2=year.getOptions();
		System.out.println(ob2.size());
   }
}
