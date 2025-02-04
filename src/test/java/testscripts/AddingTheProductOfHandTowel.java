package testscripts;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;
import pom.HandTowelPage;
import pom.HandTowelWhisListPage;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.UserAccount_Page;
import pom.WishListPage;

public class AddingTheProductOfHandTowel extends BaseClass
{
	    @Test
		public void handTowel() throws Exception
		{
		     MonteCarlo_LoginPage  login=new MonteCarlo_LoginPage(driver);
		     login.signinButton();
		     
		     
		     MonteCarlo_SigninPage sign=new MonteCarlo_SigninPage (driver);
		     sign.emailText(datautilities.readingDataExcelFile("LoginDetails", 1, 1));
		     sign.passwordText(datautilities.readingDataExcelFile("LoginDetails", 1, 2));
		     sign.loginButton();
		     
		     SoftAssert softassert=new SoftAssert();
		     softassert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("AccountPage"));
		     
		     
		     
		     UserAccount_Page accountpage=new UserAccount_Page(driver);
		     accountpage.searchBar();
		     accountpage.searchText(datautilities.readingDataPropertyFile("name"));
		     accountpage.searchTowel();
		     
		     
		     HandTowelPage page=new HandTowelPage(driver);
		     page.wishlistIcon();
		     page.wishlistButton();
		     
		     HandTowelWhisListPage  wish=new HandTowelWhisListPage(driver);
		     Thread.sleep(3000);
		     utilities.mouseHover(wish.getItem(), driver);
		     Thread.sleep(3000);
		     wish.closeButton();
		     
		     
		     
		}

	


}
