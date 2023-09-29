package test.pageom.pageexecution;

import java.awt.AWTException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.pageom.basepackage.BaseClass;
import test.pageom.pagefactory.Facebook;

public class FacebookExecution {

	@BeforeClass
	public static void launch()
	{
		BaseClass.chromeDriverLaunch();
		BaseClass.maximizeWindow();
		BaseClass.launchUrl(Facebook.url);
		BaseClass.pageWaitBasedOnDomLoad(200000);
	}
	@Test
	public void loginTc001() throws AWTException
	{
		WebElement email = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[0]));
		BaseClass.typeWrite(email, Facebook.testCaseDatas1[0]);
		WebElement pass = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[1]));
		BaseClass.typeWrite(pass, Facebook.testCaseDatas1[1]);
		BaseClass.enterKey();
		BaseClass.pageWaitBasedOnDomLoad(3000);
		WebElement error1 = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[2]));
		Assert.assertTrue(error1.isDisplayed());
		String errormessage1 = BaseClass.reteriveElementTxtAssign(error1);
		Assert.assertEquals(Facebook.ErrorMessages[0],errormessage1);
	}
	
	@Test
	public void loginTc002()
	{
		BaseClass.pageWaitBasedOnDomLoad(100000);
		WebElement loginButton = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[3]));
		BaseClass.clickElement(loginButton);
		WebElement error2 = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[2]));
		Assert.assertTrue(error2.isDisplayed());
		String errormessage2 = BaseClass.reteriveElementTxtAssign(error2);
	}
	@Test
	public void loginTc003() throws AWTException
	{
		WebElement email = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[0]));
		BaseClass.typeWrite(email, Facebook.testCaseDatas1[2]);
		BaseClass.enterKey();
		BaseClass.pageWaitBasedOnDomLoad(3000);
		WebElement error3 = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[2]));
		Assert.assertTrue(error3.isDisplayed());
		String errormessage3 = BaseClass.reteriveElementTxtAssign(error3);
		Assert.assertEquals(Facebook.ErrorMessages[1],errormessage3);
	}
	@Test
	public void loginTc004() throws AWTException
	{
		WebElement pass = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[1]));
		BaseClass.typeWrite(pass, Facebook.testCaseDatas1[1]);
		BaseClass.enterKey();
		WebElement error4 = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[2]));
		Assert.assertTrue(error4.isDisplayed());
		String errormessage4 = BaseClass.reteriveElementTxtAssign(error4);
		Assert.assertEquals(Facebook.ErrorMessages[2],errormessage4);
	}
	@Ignore
	@Test
	public void loginTextsValidate()
	{
		WebElement email = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[0]));
		String emailPH = BaseClass.attributeValueOfAssign(email, "placeholder");
		Assert.assertTrue(email.isDisplayed());
		Assert.assertEquals(Facebook.loginWebTexts[0], emailPH);
		WebElement pass = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[1]));
		String passPH = BaseClass.attributeValueOfAssign(pass, "placeholder");
		Assert.assertTrue(pass.isDisplayed());
		Assert.assertEquals(Facebook.loginWebTexts[1], passPH);
		WebElement logIn = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[4]));
		String logInText = BaseClass.reteriveElementTxtAssign(logIn);
		Assert.assertTrue(logIn.isDisplayed());
		Assert.assertEquals(Facebook.loginWebTexts[2],logInText);
		WebElement FP = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[5]));
		String fpText = BaseClass.reteriveElementTxtAssign(FP);
		Assert.assertTrue(FP.isDisplayed());
		Assert.assertEquals(Facebook.loginWebTexts[3],fpText);
		WebElement CNA = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[6]));
		String cnaText = BaseClass.reteriveElementTxtAssign(CNA);
		Assert.assertTrue(CNA.isDisplayed());
		Assert.assertEquals(Facebook.loginWebTexts[4],cnaText);	
	}
	@Test
	public void loginPropertiesValidate()
	{
		WebElement background = BaseClass.locator(By.tagName(Facebook.loginProperties[0]));
		String bgcolor = BaseClass.styleOfAssign(background, Facebook.loginProperties[1]);
		Assert.assertEquals(Facebook.loginProperties[2], bgcolor);
		
		WebElement loginSectionBg = BaseClass.locator(By.xpath(Facebook.loginProperties[4]));
		String loginSectionBgColor = BaseClass.styleOfAssign(loginSectionBg, Facebook.loginProperties[1]);
		Assert.assertEquals(Facebook.loginProperties[2], loginSectionBgColor);
		BaseClass.styleOf(loginSectionBg, loginSectionBgColor);
		
		WebElement loginButtonBg = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[3]));
		String buttonBg = BaseClass.styleOfAssign(loginButtonBg, Facebook.loginProperties[1]);
		Assert.assertEquals(Facebook.loginProperties[3], buttonBg);
	}
	@Test
	public void validFbCredentials() throws AWTException
	{
		
		WebElement email = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[0]));
		BaseClass.typeWrite(email, Facebook.correctUserId);
		WebElement pass = BaseClass.locator(By.xpath(Facebook.testCaseCommon1[1]));
		BaseClass.typeWrite(pass, Facebook.testCaseDatas1[3]);
		BaseClass.enterKey();
		BaseClass.pageWaitBasedOnDomLoad(10000);
		
	}
	@After
	public void afterTest()
	{
		BaseClass.backPage();
		BaseClass.refreshPage();
		BaseClass.pageWaitBasedOnDomLoad(3000);
		
	}
	@AfterClass
	public static void quit()
	{
		BaseClass.closeEntireDriver();
	}

}
