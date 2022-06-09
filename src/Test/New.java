package Test;

import org.testng.annotations.Test;

public class New {
	@Test(groups= {"rahul"},priority=-9)
	public void abc() {
		System.out.println("PersonalLoan1");
		
	}
	
	@Test(priority=-9)
	public void ABC() {
		System.out.println("PersonalLoan2");
	}
	
	@Test(priority=-9,groups= {"rahul"})
	public void abc3() {
		System.out.println("PersonalLoan3");
		
	}
}
