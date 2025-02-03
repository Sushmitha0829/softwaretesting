package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcComfoterPage;
import pom.FullSleeveProduct;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.UserAccount_Page;

public class CheckingPincode extends BaseClass
{
	@Test
	public void checkPincode() throws Exception
	{
		MonteCarlo_LoginPage  login=new MonteCarlo_LoginPage(driver);
	     login.signinButton();
	     
	     
	     MonteCarlo_SigninPage sign=new MonteCarlo_SigninPage (driver);
	     sign.emailText(datautilities.readingDataExcelFile("LoginDetails", 1, 1));
	     sign.passwordText(datautilities.readingDataExcelFile("LoginDetails", 1, 2));
	     sign.loginButton();
	     
	     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("AccountPage"));
	     
	     UserAccount_Page accountpage=new UserAccount_Page(driver);
	     utilities.mouseHover(accountpage.getMen(),driver);
	     accountpage.roundNeck();
	     
	     AcComfoterPage comfort=new AcComfoterPage(driver);
	     comfort.clickSize();
	     comfort.selectMenSize();
	     Thread.sleep(3000);
	     comfort.clickBrands();
	     Thread.sleep(3000);
	     comfort.selectRockit();
	     Thread.sleep(3000);
	     comfort.clickSleeve();
	     Thread.sleep(3000);
	     comfort.selectFullSleeve();
	     Thread.sleep(3000);
	     comfort.selectImage(); 
	     Thread.sleep(3000);
	    
	     
	     FullSleeveProduct product=new FullSleeveProduct(driver);
	     
	     product.pincode(datautilities.readingDataPropertyFile("num"));
	     
	     product.clickPincode();
	    
	     
	     
		
	}

}
