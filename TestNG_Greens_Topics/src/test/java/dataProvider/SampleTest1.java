package dataProvider;

import org.testng.annotations.Test;

public class SampleTest1 {
	@Test(groups="Smoke")
	public void tc1() {
		System.out.println("TC100");
	}
	@Test(groups="Sanity")	
	public void tc2() {
		System.out.println("TC200");
	}
	@Test(groups="Regression")
	public void tc3() {
		System.out.println("TC300");
	}
}
