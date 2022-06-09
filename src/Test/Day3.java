package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCarLoad");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("@@AfterMethod");
	}

	@BeforeTest
	public void pre() {
		System.out.println("I will execute first : @BeforeTest");
	}
	
	@AfterTest
	public void post() {
		System.out.println("I will execute last : @AfterTest");
	}
	
	@BeforeSuite
	public void beforesuitepre() {
		System.out.println("I will execute first : @@BeforeSuite");
	}
	
	@AfterSuite
	public void Aftersuitepre() {
		System.out.println("I will execute last : @@@AfterSuite");
	}
	
	@Parameters({"sanket"})
	@Test
	public void MobileLoginCarLoan(String v) {
		System.out.println("MobileLoginCarLoan");
		System.out.println(v);
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("@AfterClass");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("@BeforeClass");
	}
	@Test(groups= {"smoke"})
	public void LoginAPICarLoan() {
		System.out.println("LoginAPICarLoan");
	}
}
