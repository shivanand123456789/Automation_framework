package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demologinfb 
{

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", "./Softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("shiva@gmail.com");
		
		
		
		
		
		

	}

}
