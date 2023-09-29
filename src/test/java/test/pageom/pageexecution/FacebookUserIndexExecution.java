package test.pageom.pageexecution;

import java.awt.AWTException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import test.pageom.basepackage.BaseClass;
import test.pageom.pagefactory.Facebook;
import test.pageom.pagefactory.FacebookUserIndex;

public class FacebookUserIndexExecution {

	
	@BeforeClass
	public static void launch2()
	{
		BaseClass.chromeDriverLaunch();
		BaseClass.maximizeWindow();
		BaseClass.launchUrl(Facebook.url);
		FacebookExecution fie = new FacebookExecution();
		try {
			fie.validFbCredentials();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void checkValidateFbUser()
	{
	  FacebookUserIndex.checkIfValidateFbUser();
	}
	@AfterClass
	public static void quit()
	{
		BaseClass.closeEntireDriver();
	}
	
  

}
