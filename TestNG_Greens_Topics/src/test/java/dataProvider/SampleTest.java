package dataProvider;

import org.testng.annotations.Test;

public class SampleTest {
	@Test(groups="Smoke")
public void tc1() {
System.out.println("TC1");
}
	@Test(groups="Sanity")	
public void tc2() {
	System.out.println("TC2");
}
	@Test(groups="Regression")
public void tc3() {
	System.out.println("TC3");
}



}
