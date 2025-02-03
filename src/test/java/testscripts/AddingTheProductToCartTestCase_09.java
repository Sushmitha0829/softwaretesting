package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AddProductPage;
import pom.BestSelling;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.UserAccount_Page;

public class AddingTheProductToCartTestCase_09 extends BaseClass
{
	@Test
	public void addToCart() throws Exception
	{
		MonteCarlo_LoginPage  login=new MonteCarlo_LoginPage(driver);
	     login.signinButton();
	     
	     
	     MonteCarlo_SigninPage sign=new MonteCarlo_SigninPage (driver);
	     sign.emailText(datautilities.readingDataExcelFile("LoginDetails", 1, 1));
	     sign.passwordText(datautilities.readingDataExcelFile("LoginDetails", 1, 2));
	     sign.loginButton();
	     
	     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("AccountPage"));
	     
	     UserAccount_Page page=new UserAccount_Page(driver);
	     page.cartIcon();
	     page.startShopping();
	     
	     BestSelling sell=new BestSelling(driver);
	     sell.sortSelling();
	     sell.selectOne();
	     sell.clickProduct();
	     
	     AddProductPage add=new AddProductPage(driver);
	     add.addProduct();
	     add.orderNote();
	     add.sendNotes(datautilities.readingDataPropertyFile("note"));
	     add.saveButton();
	     add.closeButton();
	     
		
	}

}
