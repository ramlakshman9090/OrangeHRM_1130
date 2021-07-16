package orangehrm.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage 
{
public static WebDriver driver;


public By un1 = By.id("txtUsername");
public By pwd1 = By.id("txtPassword");
public By login = By.id("btnLogin");
//	public static void adminLogin(String uid,String pwd)
//	{
//
//	      
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
//		driver.findElement(By.id("btnLogin")).click();
//		if(driver.findElement(By.linkText("Admin")).isDisplayed())
//		{
//			return true;
//		}else
//		{
//			return false;
//		}
		//}
public void adminLogout()
{
	driver.findElement(By.partialLinkText("Welcome")).click();
	driver.findElement(By.partialLinkText("Logout")).click();
	
	}
	
}

	




