package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AboutUs_Blog_Page;

public class AboutUs_Blog_Test extends BaseTest {
	
	@Test
	public void aboutus_test() throws InterruptedException {
		AboutUs_Blog_Page a = new AboutUs_Blog_Page(driver);
		Thread.sleep(2000);
		a.aboutus_option_clicking();
	}

	@Test
	public void blog_test() throws InterruptedException {
	AboutUs_Blog_Page a = new AboutUs_Blog_Page(driver);
	Thread.sleep(1000);
	a.blog_option_clicking();

	}

}
