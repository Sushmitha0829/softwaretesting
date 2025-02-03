package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.WishListPage;
import pom.WomenPage;
import pom.WomenStolePage;
import pom.WomenStoleShawls;

public class WomenWhishlistWithoutLogin extends BaseClass 
{
	@Test
	public void womenWhislist() throws Exception
	{
		WomenPage page=new WomenPage(driver);
		page.womenClick();
		
		WomenStolePage stole=new WomenStolePage(driver);
		stole.stoleOnClick();
		
		 WomenStoleShawls shawl=new  WomenStoleShawls(driver);
		 shawl.setPrize(datautilities.readingDataPropertyFile("number"));
	     shawl.resetFilter();
	     shawl.setnum(datautilities.readingDataPropertyFile("number1"));
	     shawl.setnum1(datautilities.readingDataPropertyFile("number2"));
		 shawl.selectProduct();
		 
		 WishListPage wish=new WishListPage(driver);
		 wish.wishlist();
		 Reporter.log(wish.getText(),true);
		 wish.closebtn();
		 
		 
		 
		 
	}
	
	

}
