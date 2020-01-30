package util;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class ExcelReader {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "username1", "Password1" },
      new Object[] { "Username2", "Password2" },
    };
  }
	// update
}
