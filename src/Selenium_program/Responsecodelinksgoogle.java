package Selenium_program;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodelinksgoogle {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkcount() throws IOException
	{List<WebElement> li = driver.findElements(By.tagName("a"));
	System.out.println(li.size());
	for(WebElement s:li)
	{
		String link=s.getAttribute("href");
		String text=s.getText();
		System.out.println(link+"..."+text);
	
		
		URL ob=new URL(link);
	
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	int responsecode=con.getResponseCode();
	System.out.println(responsecode);
	con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid");
			
		}
		else
		{
			System.out.println("invalid");
		}

}
}}