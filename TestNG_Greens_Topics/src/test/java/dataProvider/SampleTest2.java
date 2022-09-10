package dataProvider;

import org.testng.annotations.Test;

public class SampleTest2 {
	@Test(groups="Smoke")
	public void tc1() {
		System.out.println("TC1000");
	}
	@Test(groups="Sanity")
	public void tc2() {
		System.out.println("TC2000");
	}
	@Test(groups="Regression")
	public void tc3() {
		System.out.println("TC3000");
	}
}
