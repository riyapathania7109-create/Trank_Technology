package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.ContactUs_Portfolio_Page;

public class ContactUs_Portfolio_Test extends BaseTest {
	
@Test
	public void contactus_test() throws InterruptedException {
		ContactUs_Portfolio_Page a = new ContactUs_Portfolio_Page(driver);
		Thread.sleep(2000);
		a.contactus_option_clicking();
	}
@Test	
	public void portfolio_test() throws InterruptedException {
		ContactUs_Portfolio_Page a = new ContactUs_Portfolio_Page(driver);
		Thread.sleep(2000);
		a.portfolio_option_clicking();
	}
	}

