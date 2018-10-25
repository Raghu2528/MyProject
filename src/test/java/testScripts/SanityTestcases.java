package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import applicationLibaray.GenericMethods;

public class SanityTestcases {

	WebDriver driver;
	
	@BeforeMethod
	public static void launchBrowser() {
		GenericMethods.launchBrowser();
	}
	
	@Test(priority=0)
	public static void  test_001() throws InterruptedException {
		Thread.sleep(1000);
		GenericMethods.enterText(objectRepositories.Login_Page.username, "raghu");
		GenericMethods.enterText(objectRepositories.Login_Page.password, "raghu@123");
		GenericMethods.clickBtn(objectRepositories.Login_Page.login_Btn);
		
	}
	
//	@AfterMethod
//	public static void quit() {
//		GenericMethods.quit();
//	}
	
	
	
	
}
