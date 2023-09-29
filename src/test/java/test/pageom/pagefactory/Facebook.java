package test.pageom.pagefactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.pageom.basepackage.BaseClass;

public class Facebook {

	public static String url = "https://www.facebook.com/";
	public static String ErrorMessages[] = {
			"The email address you entered isn't connected to an account. Find your account and log in.",
			"The password that you've entered is incorrect. Forgotten password?",
			"The email address or mobile number you entered isn't connected to an account. Find your account and log in."
	};
	/**** Test with Correct User Id *******/
	public static String correctUserId = "kumaresan.thiru.75";
	
	public static String correctUserURL = url+correctUserId;
	
	public static String testCaseCommon1[] = {
			"//*[@id='email']", 
			"//*[@id='pass']", 
			"//*[@class='_9ay7']",
			"//*[@name='login']",
			"//button[text()='Log in']",
			"//a[text()='Forgotten password?']",
			"//*[text()='Create new account']",
			"a[href$='"+correctUserId+"']"
	};
	public static String testCaseDatas1[] = {
			"kumarresn381@gmail.com", "12345",
			"kumaresan","A2Z029knl**"
			
	};
	
	public static String loginWebTexts[] = {
			"Email address or phone number",
			"Password",
			"Log in",
			"Forgotten password?",
			"Create new account"
	};
	public static String loginProperties[] = {
		"body","background-color",
		"rgba(255, 255, 255, 1)",
		"rgba(24, 119, 242, 1)",
		"//*[@class='_6luv _52jv']",
		"padding-top","24px"
		
		
	};
	public static void checkIfValidateFbUser()
	{
		WebElement findFbId = BaseClass.locator(By.cssSelector(testCaseCommon1[7]));
		String attFindFbId = BaseClass.attributeValueOfAssign(findFbId, "href");
		Assert.assertEquals(correctUserURL, attFindFbId);
	}

}
