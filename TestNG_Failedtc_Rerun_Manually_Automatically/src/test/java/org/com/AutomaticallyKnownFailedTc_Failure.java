package org.com;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class AutomaticallyKnownFailedTc_Failure implements IRetryAnalyzer {
     int min=0,max=3;
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
