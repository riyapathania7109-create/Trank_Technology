package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vertical_Page {

	private WebDriver driver;
	private Actions a;
//	public Actions a=new Actions(driver);
	//welcome
	@FindBy(xpath="(//a[text()=\"Verticals\"])[1]")
	WebElement ver;
	
	@FindBy(xpath="//strong[text()=\"Trading\"]")
	WebElement tr;
	
	@FindBy(xpath="(//a[text()=\"Stock Trading\"])[1]")
	WebElement tr1;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/algo-trading-app-development-company\"])[1]")
	WebElement tr2;
	
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/paper-trading-app-development-company\"])[1]")
	WebElement tr3;
	
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/custom-trading-software-development-company\"])[1]")
	WebElement tr4;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/cfd-trading-app-development-company\"])[1]")
	WebElement tr5;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/webportal-trading-development\"])[1]")
	WebElement tr6;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/stock-trading-development-in-massachusetts\"])[1]")
	WebElement tr7;
	
	@FindBy(xpath="//strong[text()=\"Retail and Ecommerce\"]")
	WebElement re;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/ecommerce-web-development-company\"])[1]")
	WebElement re1;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/ecommerce-app-development\"])[1]")
	WebElement re2;
	
	@FindBy(xpath="//strong[text()=\"Healthcare\"]")
	WebElement he;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/diet-and-nutrition-app-developement\"])[1]")
	WebElement he1;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/health-tracking-app\"])[1]")
	WebElement he2;
	
	@FindBy(xpath="//strong[text()=\"Fintech\"]")
	WebElement fi;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/pos-software-development-company\"])[1]")
	WebElement fi1;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/cryptocurrency-mobile-app-development-company\"])[1]")
	WebElement fi2;
	
	@FindBy(xpath="//strong[text()=\"Custom App\"]")
	WebElement cu;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/desktop-application-development-company\"])[1]")
	WebElement cu1;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/hrm-application-development-company\"])[1]")
	WebElement cu2;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/travel-mobile-app-development-company\"])[1]")
	WebElement cu3;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/dating-app-development-company\"])[1]")
	WebElement cu4;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/usa/custom-crm-development-company-usa\"])[1]")
	WebElement cu5;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/custom-crm-development-company\"])[1]")
	WebElement cu6;
	
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/erp-app-development-company\"])[1]")
	WebElement cu7;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/e-learning-mobile-app-development-company\"])[1]")
	WebElement cu8;
	
	@FindBy(xpath="(//a[@href=\"https://www.tranktechnologies.com/real-estate-mobile-app-development-company\"])[1]")
	WebElement cu9;
	
	//constructor
	public Vertical_Page(WebDriver driver) 
	{
		this.driver=driver;
		this.a = new Actions(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void verticalmouseover() 
	{
		a.moveToElement(ver).perform();
	}
	
	public void tradingmouseover()
	{
		a.moveToElement(tr).perform();
	}
	
	public void retailandcommercemouseover()
	{
		a.moveToElement(re).perform();
	}
	
	public void healthcaremouseover()
	{
		a.moveToElement(he).perform();
	}
	
	public void fintechmouseover()
	{
		a.moveToElement(fi).perform();
	}
	
	public void customappmouseover()
	{
		a.moveToElement(cu).perform();
	}
	
	public void trading_option_clicking() throws InterruptedException
	{
		WebElement tr_list[]= {tr1,tr2,tr3,tr4,tr5,tr6,tr7};
		for (int i=0;i<tr_list.length;i++) 
		{
		verticalmouseover();
		Thread.sleep(2000);
		tradingmouseover();
		Thread.sleep(2000);
		tr_list[i].click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		PageFactory.initElements(driver, this);
		}
	}
		public void retail_option_clicking() throws InterruptedException
		{
			WebElement re_list[]= {re1,re2};
			for (int i=0;i<re_list.length;i++)
				{
				verticalmouseover();
				Thread.sleep(2000);
				retailandcommercemouseover();
				Thread.sleep(2000);
				re_list[i].click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				PageFactory.initElements(driver, this);
				}
		}
			
			public void healthcare_option_clicking() throws InterruptedException 
			{
				WebElement he_list[]= {he1,he2};
				for (int i=0;i<he_list.length;i++)
					{
					verticalmouseover();
					Thread.sleep(2000);
					healthcaremouseover();
					Thread.sleep(2000);
					he_list[i].click();
					Thread.sleep(2000);
					driver.navigate().back();
					Thread.sleep(2000);
					PageFactory.initElements(driver, this);
					}
			}
				
				public void fintech_option_clicking() throws InterruptedException
				{
					WebElement fi_list[]= {fi1,fi2};
					for (int i=0;i<fi_list.length;i++)
					{
						verticalmouseover();
						Thread.sleep(2000);
						fintechmouseover();
						Thread.sleep(2000);
						fi_list[i].click();
						Thread.sleep(2000);
						driver.navigate().back();
						Thread.sleep(2000);
						PageFactory.initElements(driver, this);
						
					}
				}
				public void customapp_option_clicking() throws InterruptedException
				{
					WebElement cu_list[]= {cu1,cu2,cu3,cu4,cu5,cu6,cu7,cu8,cu9};
					for (int i=0;i<cu_list.length;i++)
					{
						verticalmouseover();
						Thread.sleep(2000);
						customappmouseover();
						Thread.sleep(2000);
						cu_list[i].click();
						Thread.sleep(2000);
						driver.navigate().back();
						Thread.sleep(2000);
						PageFactory.initElements(driver, this);
					}
								
	
	}

}
