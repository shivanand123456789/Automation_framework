import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parralleexecution
{
	public WebDriver driver;
	@Test
	@Parameter ({"default browser"})
	public void test1(String browser) 
	{
	System.setProperty("webdriver.gecko.driver", "./softawares/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./softawares/chromedriver.exe");
	if(browser.equals("firefox"))
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	else 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	}
}

	
