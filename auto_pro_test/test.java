package auto_pro_test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page_pro.page;

public class test extends baseclass
{
@Test
public void test() throws InterruptedException, IOException
{
	page r = new page(d);
	d.manage().window().maximize();
	Thread.sleep(2000);
	r.click1();
	r.details("Gino", "Peter");
	r.dropdowns();
	r.nextpage();
	r.title_verification();
	r.screenshot();
}
@AfterTest
public void at()
{
	d.close();
}
}
