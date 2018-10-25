package applicationLibaray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethods {
static WebDriver  driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\ExploraBI\\Seleinum\\chromedriver\\chromedriver5.exe");
		driver = new ChromeDriver();
		driver.get("http://172.16.0.43:8080/home/#/login");
		driver.manage().window().maximize();
				
	}
	
	public static void enterText(String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public static void clickBtn(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void login() {
		driver.findElement(By.xpath(""));
	}
	
	public static void logout() {
		
	}
	
	public static void quit() {
		driver.quit();
	}
}
