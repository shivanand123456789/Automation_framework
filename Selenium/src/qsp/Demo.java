package qsp;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{

	public static void main(String[] args) throws Exception
	{
		String key="webdriver.chrome.driver";
		String Value="./Softwares/chromedriver.exe";
		System.setProperty(key,Value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
		

	}

}
