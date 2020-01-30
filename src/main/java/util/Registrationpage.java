package util;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class Registrationpage {

	@Test
	public  void register() throws InterruptedException {
		Resuable r=new Resuable();
		r.LaunchChrome();
		
		LoginPage p=new LoginPage();
		p.Register();
		
		Thread.sleep(5000);
		p.CloseWindow();

	}

}
