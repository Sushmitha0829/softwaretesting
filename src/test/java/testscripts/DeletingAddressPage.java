package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AddressesPage;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.UserAccount_Page;

public class DeletingAddressPage extends BaseClass
{
	@Test
	public void deletingAddress() throws Exception
	{
		MonteCarlo_LoginPage  login=new MonteCarlo_LoginPage(driver);
	     login.signinButton();
	     
	     
	     MonteCarlo_SigninPage sign=new MonteCarlo_SigninPage (driver);
	     sign.emailText(datautilities.readingDataExcelFile("LoginDetails", 1, 1));
	     sign.passwordText(datautilities.readingDataExcelFile("LoginDetails", 1, 2));
	     sign.loginButton();
	     
	     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("AccountPage"));
	     
	     UserAccount_Page page=new UserAccount_Page(driver);
	     page.addAddress();
	     
	     AddressesPage  addresspage=new AddressesPage(driver);
	     addresspage.deletingAddress();
	     Thread.sleep(3000);
	     utilities.alertacceptPopup(driver);
	}
	

}
