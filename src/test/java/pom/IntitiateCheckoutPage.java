package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IntitiateCheckoutPage 
{
	
	public IntitiateCheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
