package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AddProductPage;
import pom.BlanketProductPage;
import pom.FindingAStorePage;
import pom.MonteCarloHomePage;
import pom.MonteCarlo_LoginPage;
import pom.MonteCarlo_SigninPage;
import pom.UserAccount_Page;

public class CheckingManufacturerPincode extends BaseClass
{
	@Test
	public void manufacturerPincode() throws Exception 
	{

	MonteCarlo_LoginPage  login=new MonteCarlo_LoginPage(driver);
     login.signinButton();
     
     
     MonteCarlo_SigninPage sign=new MonteCarlo_SigninPage (driver);
     sign.emailText(datautilities.readingDataExcelFile("LoginDetails", 1, 1));
     sign.passwordText(datautilities.readingDataExcelFile("LoginDetails", 1, 2));
     sign.loginButton();
     
     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("AccountPage"));
     
     UserAccount_Page accountpage=new UserAccount_Page(driver);
     accountpage.monteCarloHome();
     
     MonteCarloHomePage page=new  MonteCarloHomePage(driver);
     page.shopBlanket();
     
     BlanketProductPage product=new BlanketProductPage(driver);
     product.clickProduct();
     
     AddProductPage addproduct=new AddProductPage(driver);
     addproduct.productDescription();
     addproduct.ourStore();
     
     Assert.assertEquals(driver.getTitle(), datautilities.readingDataPropertyFile("StorePage"));
     
     FindingAStorePage store=new FindingAStorePage(driver);
     store.searchText(datautilities.readingDataPropertyFile("pincode"));
     store.getDirection();
     
     
	}
	

}
