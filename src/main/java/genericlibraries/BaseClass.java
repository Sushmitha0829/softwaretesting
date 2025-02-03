package genericlibraries;



import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners(Listners.class)
public class BaseClass 
{
	public static WebDriver driver;
	public DataUtilities datautilities=new DataUtilities();
	public WebDriverUtilities utilities=new WebDriverUtilities();
	@BeforeMethod
	public void openApp() throws Exception
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(datautilities.readingDataExcelFile("LoginDetails", 1, 0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@AfterMethod
	public void closeApp() 
	{
		driver.quit();
	}

}
