package Selenium_program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String  actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="google123";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}

	}

}