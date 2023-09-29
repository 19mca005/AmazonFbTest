package test.pageom.pageexecution;

import java.awt.AWTException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import test.pageom.basepackage.BaseClass;
import test.pageom.pagefactory.AmazonSignin;

public class AmazonSigninExecution {

	
		@BeforeClass
		public static void launch() throws InterruptedException, AWTException{
			AmazonSignin asi = new AmazonSignin();
			BaseClass.chromeDriverLaunch();
			BaseClass.maximizeWindow();
			BaseClass.launchUrl(asi.amazonSigninURL);
		}
		@Test
		public void tc002() throws AWTException
		{
			AmazonSignin asi = new AmazonSignin();
			BaseClass.typeWrite(asi.enterMobileTc1,asi.expectedMobileNumberTc1);
			BaseClass.enterKey();
			Assert.assertTrue(asi.errorBoxTc1.isDisplayed());
			String e1 = BaseClass.reteriveElementTxtAssign(asi.errorBoxText);
			Assert.assertEquals(asi.Expectederror1, e1);
		}
		@After
		public void refreshPage()
		{
			BaseClass.backPage();
			BaseClass.refreshPage();
		}
		@AfterClass
		public static void quit()
		{
			BaseClass.closeEntireDriver();
		}
}
