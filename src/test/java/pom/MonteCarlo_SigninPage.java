package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonteCarlo_SigninPage 
{
	@FindBy(id="customer[email]")
	private WebElement email;
	
	@FindBy(id="customer[password]")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginbtn;
	
	public MonteCarlo_SigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void emailText(String data)
	{
		email.sendKeys(data);
	}
	public void passwordText(String data)
	{
		password.sendKeys(data);
	}
	public void loginButton()
	{
		loginbtn.click();
	}
	

}
