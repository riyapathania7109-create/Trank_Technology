package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Technology_Page {

	private WebDriver driver;
	private Actions a;
	
	@FindBy(xpath="(//a[@href=\"#\"])[5]")
	WebElement tech;
	
	
	@FindBy(xpath="//strong[text()=\"eCommerce Development\"]")
	WebElement ecom;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/magento-development\"])[1]")
	WebElement ecom1;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/codeigniter-development\"])[1]")
	WebElement ecom2;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/big-commerce\"])[1]")
	WebElement ecom3;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/cs-cart-development\"])[1]")
	WebElement ecom4;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/nopcommerce-design-and-development-company\"])[1]")
	WebElement ecom5;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/laravel-development\"])[1]")
	WebElement ecom6;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/drupal-development\"])[1]")
	WebElement ecom7;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/joomla-development\"])[1]")
	WebElement ecom8;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/express-js-development\"])[1]")
	WebElement ecom9;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/opencart-development\"])[1]")
	WebElement ecom10;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/wordpress-development\"])[1]")
	WebElement ecom11;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/shopify-development\"])[1]")
	WebElement ecom12;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/node-js-development\"])[1]")
	WebElement ecom13;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/woocommerce-development\"])[1]")
	WebElement ecom14;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/prestashop-development\"])[1]")
	WebElement ecom15;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/wix-development\"])[1]")
	WebElement ecom16;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/react-js-development\"])[1]")
	WebElement ecom17;
	
	@FindBy(xpath="//strong[text()=\"Mobile App Development\"]")
	WebElement mad;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/react-native-mobile-app-development\"])[1]")
	WebElement mad1;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/xamarin-mobile-app-development\"])[1]")
	WebElement mad2;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/flutter-mobile-app-development\"])[1]")
	WebElement mad3;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/swift-mobile-app-development\"])[1]")
	WebElement mad4;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/enterprise-mobile-app-development\"])[1]")
	WebElement mad5;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/kotlin-mobile-app-development\"])[1]")
	WebElement mad6;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/ionic-mobile-app-development\"])[1]")
	WebElement mad7;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/appointment-booking-development\"])[1]")
	WebElement mad8;
	
	@FindBy(xpath="//strong[text()=\"Artificial Intelligence\"]")
	WebElement ai;
	
	public Technology_Page(WebDriver driver) {
		this.driver=driver;
		this.a=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void technologymouseover()
	{
		a.moveToElement(tech).perform();
	}
	
	public void ecommercemouseover()
	{
		a.moveToElement(ecom).perform();
	}
	
	public void mobileappmouseover()
	{
		a.moveToElement(mad).perform();
	}
	
	public void aimouseover()
	{
		a.moveToElement(ai).perform();
	}
	
	public void ecommerce_option_clicking() throws InterruptedException {
	WebElement ecom_list[]= {ecom1,ecom2,ecom3,ecom4,ecom5,ecom6,ecom7,ecom8,ecom9,ecom10,ecom11,ecom12,ecom13,ecom14,ecom15,ecom16,ecom17};
	
	for(int i=0;i<ecom_list.length;i++)
	{
		technologymouseover();
		Thread.sleep(1000);
		ecommercemouseover();
		Thread.sleep(1000);
		ecom_list[i].click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		PageFactory.initElements(driver, this);
	}
	}
	
	public void mobileapp_option_clicking() throws InterruptedException {
		WebElement mad_list[]= {mad1,mad2,mad3,mad4,mad5,mad6,mad7,mad8};
		
			for (int i=0;i<mad_list.length;i++) 
			{
				technologymouseover();
				Thread.sleep(1000);
				mobileappmouseover();
				Thread.sleep(1000);
				mad_list[i].click();
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(1000);
				PageFactory.initElements(driver, this);
			}
	}
	
	public void ai_option_clicking() throws InterruptedException {
		technologymouseover();
		Thread.sleep(1000);
		aimouseover();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		PageFactory.initElements(driver, this);
	}		

	}


