package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs_Blog_Page {

	private WebDriver driver;
	private Actions a;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/about\"])[1]")
	WebElement au;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/blog/\"])[1]")
	WebElement b;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/blog/category/app-development/\"])[2]")
	WebElement b1;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/blog/category/artificial-intelligence/\"]")
	WebElement b2;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/blog/category/content-marketing/\"]")
	WebElement b3;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/blog/category/crm-development/\"]")
	WebElement b4;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/blog/category/digital-marketing/\"]")
	WebElement b5;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/blog/category/ecommerce-development/\"])[5]")
	WebElement b6;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/blog/category/email-marketing/\"]")
	WebElement b7;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/blog/category/graphic-design/\"])[3]")
	WebElement b8;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/blog/category/software-it-company/\"]")
	WebElement b9;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/blog/category/software-development/\"]")
	WebElement b10;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/blog/category/ui-ux-design/\"])[5]")
	WebElement b11;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/blog/category/web-development/\"])[5]")
	WebElement b12;
	
	public AboutUs_Blog_Page (WebDriver driver) {
		this.driver=driver;
		this.a=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
//	public void blogmouseover()
//	{
//		a.moveToElement(b).perform();
//	}
	
	public void aboutus_option_clicking() throws InterruptedException {
		au.click();
		Thread.sleep(2000);
		driver.navigate().back();
		PageFactory.initElements(driver, this);
	}
	
	public void blog_option_clicking() throws InterruptedException {
		
		
		WebElement b_list[]= {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12};
		
		for (int i=0;i<b_list.length;i++)
		{
			b.click();
			Thread.sleep(2000);
			b_list[i].click();
			Thread.sleep(2000);
			driver.navigate().back();
			PageFactory.initElements(driver, this);
		}
	}

}
