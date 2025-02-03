package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AddProductPage;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.UserAccount_Page;
import pom.WomenHoodedJackets;

public class AddingTheProductWomenHoodedJackets extends BaseClass
{
	@Test
	public void hoodedJackets() throws Exception
	{
		MonteCarlo_LoginPage  login=new MonteCarlo_LoginPage(driver);
	     login.signinButton();
	     
	     
	     MonteCarlo_SigninPage sign=new MonteCarlo_SigninPage (driver);
	     sign.emailText(datautilities.readingDataExcelFile("LoginDetails", 1, 1));
	     sign.passwordText(datautilities.readingDataExcelFile("LoginDetails", 1, 2));
	     sign.loginButton();
	     
	     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("AccountPage"));
	     
	     UserAccount_Page page=new UserAccount_Page(driver);
	     page.womenSearchBar();
	     page.searchText(datautilities.readingDataPropertyFile("WomenSearch"));
	     page.viewAll();
	     
	     WomenHoodedJackets jackets=new WomenHoodedJackets(driver);
	     jackets.women();
	     
	     AddProductPage product=new AddProductPage(driver);
	     product.womenProductSize();
	     product.selectButton();
	     product.addProduct();
	     product.initiateCheckout();
	}

}
