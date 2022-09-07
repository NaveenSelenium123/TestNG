package org.com;

import org.testng.Assert;
import org.testng.annotations.Test;



public class ManuallyRerun {
	@Test
public void tc1() {
	System.out.println(1);
}
	@Test
	public void tc2() {
		Assert.assertTrue(true);
	System.out.println(2);
}
	@Test
	public void tc3() {
	System.out.println(3);
}



}
