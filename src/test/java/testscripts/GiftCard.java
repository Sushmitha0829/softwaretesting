package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.GiftCardDetailsPage;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.UserAccount_Page;
import pom.ValentinesDayGiftCard;

public class GiftCard extends BaseClass
{
	@Test
	public void giftcard() throws Exception
	{
		 MonteCarlo_LoginPage  login=new MonteCarlo_LoginPage(driver);
	     login.signinButton();
	     
	     
	     MonteCarlo_SigninPage sign=new MonteCarlo_SigninPage (driver);
	     sign.emailText(datautilities.readingDataExcelFile("LoginDetails", 1, 1));
	     sign.passwordText(datautilities.readingDataExcelFile("LoginDetails", 1, 2));
	     sign.loginButton();
	     
	     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("AccountPage"));
	     
	     UserAccount_Page accountpage=new UserAccount_Page(driver);
	     accountpage.giftCard();
	     
	     ValentinesDayGiftCard card=new ValentinesDayGiftCard(driver);
	     card.valentineGift();
	     
	     GiftCardDetailsPage page=new GiftCardDetailsPage(driver);
	     page.amountSelect();
	     page.sendReceiptName(datautilities.readingDataPropertyFile("lastname"));
	     page.sendNumber(datautilities.readingDataPropertyFile("phoneNumber"));
	     page.sendEmail(datautilities.readingDataPropertyFile("mail"));
	     page.messageText(datautilities.readingDataPropertyFile("Text"));
	     page.buyNow();
	     driver.navigate().back();
	     Thread.sleep(3000);
	     page.closeButton();
	     
	}

}
