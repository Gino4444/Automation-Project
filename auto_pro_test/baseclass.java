package auto_pro_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class baseclass 
{
	WebDriver d;
	@BeforeClass
	public void bc()
	{
		d=new ChromeDriver();
		d.get("https://patientportal.rajagirihospital.com/");
	}

}
