package Selenium_program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String pageSource = driver.getPageSource();	
	//	System.out.println(pageSource);//
		if (pageSource.contains("Gmail"))
				{
			System.out.println("Pass");
			
				}
		
		else
		{
			System.out.println("Fail");
		}
	}

}
