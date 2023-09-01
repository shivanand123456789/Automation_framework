import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot 
{
	public static void main(WebDriver driver) throws IOException
	{
		String photo="./photos";
			Date d=new Date();
			//	System.out.println(d);
				 String d1=d.toString();
				//	System.out.println(d1);
					String d2=d1.replaceAll("i", "-");
				//	System.out.println(d2);  
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileHandler.copy(src, dst);

				
	}

}
