package PageObjects;

import org.openqa.selenium.By;
import util.Resuable;

public class LoginPage extends Resuable{
	
	By LRegisterLink = By.linkText("Register");
	By RBGenderMale = By.xpath("//input[@value='M']");
	By Tfirstname = By.id("FirstName");
	By Tlastname = By.id("LastName");
	By TEmail = By.id("Email");
	By TPassword = By.id("Password");
	By TCPassowrd = By.id("ConfirmPassword");
	By BRegister = By.xpath("//input[@type='submit' and @name ]");
	
	public void clickOnRegister() {
		driver.findElement(LRegisterLink).click();
	}
	
	public void Register() {
		Resuable r = new Resuable();
		r.Click(LRegisterLink);
		r.Click(RBGenderMale);
		r.SendKeys(Tfirstname, "Moun");
		r.SendKeys(Tlastname, "Bad");
		r.SendKeys(TEmail, "bcd@gmail.com");
		r.SendKeys(TPassword, "abcd1234");
		r.SendKeys(TCPassowrd, "abcd1234");
	//	r.Click(BRegister);
	}

}
