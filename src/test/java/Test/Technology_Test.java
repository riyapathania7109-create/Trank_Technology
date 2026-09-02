package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Technology_Page;

public class Technology_Test extends BaseTest {
	
@Test
	public void ecommerce_test() throws InterruptedException {
		Technology_Page a = new Technology_Page (driver);
		Thread.sleep(1000);
		a.ecommerce_option_clicking();
	}

	@Test
	public void mobileapp_test() throws InterruptedException {
	Technology_Page a = new Technology_Page (driver);
	Thread.sleep(1000);
	a.mobileapp_option_clicking();
	}
	
	@Test
	public void ai_test() throws InterruptedException {
	Technology_Page a = new Technology_Page (driver);
	Thread.sleep(1000);
	a.ai_option_clicking();
	}	
	}
