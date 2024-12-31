package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbpage;
import utilities.Excelutil;


public class Fbtest extends Baseclass{
	@Test
	public void verifyLoginWithValidCred()
	{
		Fbpage p1= new Fbpage(driver);
		//Reading the data from excel file by specified path
		String xl="C:\\Users\\Arya Venugopal\\OneDrive\\Desktop\\apachexl\\fblogin.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelutil.getCellValue(xl,Sheet,i,0);
			System.out.println("username----"+UserName);
			String Pwd=Excelutil.getCellValue(xl,Sheet,i,1);
			System.out.println("password----"+Pwd);
			//passsing username and password as parameters
			//submitting the data by clicking on login buttton
			//p1.setvalues("", "");
			p1.setvalues(UserName, Pwd);
			p1.login();
		}
	}

}
