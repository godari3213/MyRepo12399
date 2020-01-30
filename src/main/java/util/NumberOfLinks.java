package util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NumberOfLinks extends Resuable{

	public static void main(String[] args) throws InterruptedException {
		Resuable r=new Resuable();
		r.LaunchChrome();
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    int link=links.size();
	    System.out.println(link);
	    
	    for(int i=0;i<=link;i++) {
	    	String s=links.get(i).getText();
	    	System.out.println(i +"th link is " +  s);
	    }
	    
	    driver.close();
	}

}
