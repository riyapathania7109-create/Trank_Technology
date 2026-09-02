package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Vertical_Page;

public class Vertical_Test extends BaseTest {
	
	
	@Test
	public void trading_test() throws InterruptedException {
	Vertical_Page a = new Vertical_Page(driver);
	Thread.sleep(5000);
	a.trading_option_clicking();
	}
	
	@Test
	public void retail_test() throws InterruptedException {
	Vertical_Page a = new Vertical_Page(driver);
	Thread.sleep(5000);
	a.retail_option_clicking();
}
	@Test
	public void healthcare_test() throws InterruptedException {
		Vertical_Page a = new Vertical_Page(driver);
		Thread.sleep(5000);
		a.healthcare_option_clicking();
	}
	@Test
	public void fintech_test() throws InterruptedException {
		Vertical_Page a = new Vertical_Page(driver);
		Thread.sleep(5000);
		a.fintech_option_clicking();
	}
	@Test
	public void customapp_test() throws InterruptedException {
		Vertical_Page a = new Vertical_Page(driver);
		Thread.sleep(5000);
		a.customapp_option_clicking();
	}
	
}
