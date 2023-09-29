package test.pageom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.pageom.basepackage.BaseClass;

public class AmazonSignin {

	public AmazonSignin()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public static String expectedAmazonURL = "https://www.amazon.in";
	public static String amazonSigninURL = "https://www.amazon.in/ap/signin?.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
	public static String Expectederror1 = "We cannot find an account with that mobile number";
	@FindBy(id="//a[@id='nav-link-accountList']")
	public static WebElement hover;
	@FindBy(xpath="(//a[@href])[3]")
	public static WebElement siginButton;
	@FindBy(name="email")
	public static WebElement enterMobileTc1;
	public static String expectedMobileNumberTc1 = "861045057";
	@FindBy(xpath="(//div[@class='a-box-inner a-alert-container'])[1]")
	public static WebElement errorBoxTc1;
	@FindBy(xpath="//*[@class='a-list-item']")
	public static WebElement errorBoxText;
	
    
}
