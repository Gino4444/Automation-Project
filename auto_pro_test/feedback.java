package auto_pro_test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page_pro.home;

public class feedback 
{
	WebDriver d;
	@BeforeClass
	public void bc() 
	{
		d=new ChromeDriver();
		d.get("https://www.rajagirihospital.com/");
	}
	@Test
	public void test() throws InterruptedException, IOException
	{
		home rf = new home(d);
		d.manage().window().maximize();
		rf.feedback("Gino", "Peter", "Ernakulam");
		rf.title_verification();
		rf.screenshot();
	}
	@AfterTest
	public void at()
	{
		d.close();
	}

}
