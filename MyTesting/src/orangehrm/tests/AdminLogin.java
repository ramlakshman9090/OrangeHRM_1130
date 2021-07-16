package orangehrm.tests;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLogin extends AppUtils {

	public static void main(String[] args)
	{
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lp=new LoginPage();
		//lp.adminLogin("Admin","Qedge123!@#");
		driver.findElement(lp.un1).sendKeys("Admin");
		driver.findElement(lp.pwd1).sendKeys("Qedge123!@#");
		driver.findElement(lp.login).click();
		
		
//		boolean res = lp.adminLogin("Admin", "Qedge123!@#");
//	if(res)
//	{
//			System.out.println("Admin Login Test Pass");
//		}else
//	{
//		System.out.println("Admin Login Test Fail");
//	}
	  lp.adminLogout();
	  AppUtils.closeApp();	

	}
}

