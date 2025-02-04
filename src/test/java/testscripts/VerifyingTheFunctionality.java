package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AddProductPage;
import pom.BestSelling;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.ShippingCartPage;
import pom.UserAccount_Page;
import pom.WishListPage;


public class VerifyingTheFunctionality extends BaseClass
{
	@Test
	public void functionality() throws Exception
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
	     
	     BestSelling best=new BestSelling(driver);
	     best.sortSelling();
	     best.sortingFromHighToLow();
	     best.clickProductBed();
	     
	     AddProductPage product=new AddProductPage(driver);
	     product.addWishlistIcon();
	     product.wishlistButton();
	     
	     WishListPage list=new WishListPage(driver);
	     Thread.sleep(3000);
	     list.addCart();
	     
	     ShippingCartPage cart=new ShippingCartPage(driver);
	     Thread.sleep(3000);
	     cart.addNote();
	     cart.textNote(datautilities.readingDataPropertyFile("note"));
	     cart.checkOut();
	     
	     
	     
	     
	     
	    
	     
	}

}
