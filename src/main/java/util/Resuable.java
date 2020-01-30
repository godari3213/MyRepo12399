package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resuable {
	
	public static WebDriver driver;
	public void LaunchChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_h2a.06.17\\Desktop\\2020_Training\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	public void Click(By a) {
		driver.findElement(a).click();
	}
	
	public void SendKeys(By xpath, String value) {
		driver.findElement(xpath).sendKeys(value);
	}
	
	public void CloseWindow() {
		driver.close();
	}
	

}
