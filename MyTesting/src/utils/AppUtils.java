package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppUtils{
	
	public static WebDriver driver;

	public static void launchApp(String url)
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\omsai\\Desktop\\Myproject\\MyTesting\\Drivers2\\chromedriver.exe");
        driver=new ChromeDriver();
       driver.manage().deleteAllCookies();
       driver.get(url);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      
	}
public static void closeApp()
{
driver.close();
	}
}
