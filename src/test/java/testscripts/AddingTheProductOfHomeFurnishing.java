package testscripts;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcComfoterPage;
import pom.AddProductPage;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.ShippingCartPage;
import pom.UserAccount_Page;
import pom.WishListPage;

public class AddingTheProductOfHomeFurnishing extends BaseClass
{
	
	@Test
	public void addingProduct() throws Exception
	{
	     MonteCarlo_LoginPage  login=new MonteCarlo_LoginPage(driver);
	     login.signinButton();
	     
	     
	     MonteCarlo_SigninPage sign=new MonteCarlo_SigninPage (driver);
	     sign.emailText(datautilities.readingDataExcelFile("LoginDetails", 1, 1));
	     sign.passwordText(datautilities.readingDataExcelFile("LoginDetails", 1, 2));
	     sign.loginButton();
	     
	     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("AccountPage"));
	     
	     UserAccount_Page accountpage=new UserAccount_Page(driver);
	     utilities.mouseHover(accountpage.getHomefurnishing(),driver);
	     accountpage.accomforter();
	     
	     AcComfoterPage comfort=new AcComfoterPage(driver);
	     comfort.clickSize();
	     comfort.selectSize();
	     Thread.sleep(3000);
	     comfort.clickColour();
	     Thread.sleep(3000);
	     comfort.selectingColour();
	     Thread.sleep(3000);
	     comfort.clickBrand();
	     comfort.monteCarlo();
	     comfort.clickAvailability();
	     Thread.sleep(3000);
	     comfort.selectAvailability();
	     Thread.sleep(3000);
	     comfort.bedSheet();
	     
	     AddProductPage product=new AddProductPage(driver);
	     
	     Thread.sleep(3000);
	     product.addWishlistIcon();
	     Thread.sleep(3000);
	     product.wishlistButton();
	     
	     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("WhilistPage"));
	     Reporter.log(product.getText(),true);
	     
	     WishListPage wish=new  WishListPage(driver);
	     Thread.sleep(3000);
	     wish.addCart();
	     
	     ShippingCartPage ship=new ShippingCartPage(driver);
	     Thread.sleep(3000);
	     ship.cartIcon();
	     
	     
	     
	
	}
	
	
	
	
	

}
