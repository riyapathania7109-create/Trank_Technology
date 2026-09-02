package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUs_Portfolio_Page {

	private WebDriver driver;
	private Actions a;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/contact-us\"])[1]")
	WebElement cu;
	
	@FindBy(xpath="(//input[@placeholder=\"Your Name\"])[2]")
	WebElement cu1;
	
	@FindBy(xpath="(//input[@placeholder=\"Your Mail\"])[2]")
	WebElement cu2;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter OTP\"])[2]")
	WebElement cu3;
	
	@FindBy(xpath="(//input[@placeholder=\"Your Company\"])[2]")
	WebElement cu4;
	
	@FindBy(xpath="(//select[@name=\"service\"])[2]")
	WebElement cu5;
	
	@FindBy(xpath="(//input[@placeholder=\"Your Phone\"])[2]")
	WebElement cu6;
	
	@FindBy(xpath="(//textarea[@placeholder=\"Message\"])[2]")
	WebElement cu7;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[2]")
	WebElement cu8;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/portfolio\"]")
	WebElement p;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/web-development-company\"]")
	WebElement p1;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/cms-website-development-company\"]")
	WebElement p2;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/ecommerce-web-development-company\"])[7]")
	WebElement p3;
	
//	p4
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/custom-web-portal-development-company\"]")
	WebElement p5;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/ui-ux-design-company\"]")
	WebElement p6;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/mobile-app-design-company\"]")
	WebElement p7;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/responsive-web-design-company\"]")
	WebElement p8;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/brand-identity-design-services-company\"]")
	WebElement p9;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/app-development-company\"])[1]")
	WebElement p10;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/ios-mobile-app-development-company\"]")
	WebElement p11;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/android-mobile-app-development-company\"]")
	WebElement p12;
	
//	p13,p14
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/hybrid-mobile-app-development-company\"]")
	WebElement p15;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/cross-platform-mobile-app-development-company\"]")
	WebElement p16;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/progressive-web-app-development-company\"]")
	WebElement p17;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/graphic-design-company\"]")
	WebElement p18;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/logo-design-company\"]")
	WebElement p19;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/banner-design-company\"]")
	WebElement p20;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/packaging-design-company\"]")
	WebElement p21;
	
	@FindBy(xpath="//a[@href=\"https://www.tranktechnologies.com/business-cards-design-company\"]")
	WebElement p22;
	
	public ContactUs_Portfolio_Page (WebDriver driver) {
		this.driver=driver;
		this.a=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
		
		public void contactus_option_clicking() throws InterruptedException {
			cu.click();
			Thread.sleep(1000);
			cu1.sendKeys("Riya Pathania");
			Thread.sleep(1000);
			cu2.sendKeys("riyapathania7109@gmail.com");
			Thread.sleep(1000);
			cu3.sendKeys("123");
			Thread.sleep(1000);
			cu4.sendKeys("XYZ");
			Thread.sleep(1000);
			Select select = new Select(cu5);
			select.selectByVisibleText("Others");
			Thread.sleep(1000);
			cu6.sendKeys("7719597309");
			Thread.sleep(1000);
			cu7.sendKeys("Hi TrankTechnologies");
			Thread.sleep(1000);
			cu8.click();
			Thread.sleep(1000);
			driver.navigate().back();
			PageFactory.initElements(driver, this);
			
			
		}
		
		public void portfolio_option_clicking() throws InterruptedException {
			p.click();
			WebElement p_list[]= {p1,p2,p3,p5,p6,p7,p8,p9,p10,p11,p12,p15,p16,p17,p18,p19,p20,p21,p22};
			for (int i=0;i<p_list.length;i++) {
				System.out.println("Clicking" + p_list[i].getText());
			p_list[i].click();
			Thread.sleep(1000);
			driver.navigate().back();
			PageFactory.initElements(driver, this);
			}
	
	}

}
