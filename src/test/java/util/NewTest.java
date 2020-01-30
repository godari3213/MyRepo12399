package util;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  @Parameters({"m1","m2"})
  public void f(String m1, String m2) {
	  System.out.println(m1);
	  System.out.println(m2);
  }
}
