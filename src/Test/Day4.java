package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	
	
	@Test(dataProvider="getdata")
	public void WebLoginHomeLoan(String a , String b) {
		System.out.println("WebLoginHomeLoad");
		System.out.println(a + " " + "/ +/n" + b);
	}

	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan");
	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHomeLoan");
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object as[][] = new Object[3][2];
		as[0][0] = "username1";
		as[1][0] = "username2";
		as[2][0] = "username3";
		
		as[0][1] = "Password1";
		as[1][1] = "Password2";
		as[2][1] = "Password3";
		return as;
	}
}
