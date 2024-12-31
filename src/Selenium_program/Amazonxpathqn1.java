package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpathqn1 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void test() throws InterruptedException
	{  Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button\']")).click();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("asd@hgkl");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]")).click();
        driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a/i")).click();
        
        
        
}}
