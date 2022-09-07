package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class SampleReport {
	WebDriver driver;
    static ExtentReports report;
    static ExtentTest test;

@BeforeTest
public void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	report=new ExtentReports("D:\\selenium jar march2022--for git project\\TestNG_Extent-Report_Email-Report\\Report\\report.html",true);
	test=report.startTest("Extent Test Demo");
	driver.get("https://www.google.com");
}
@AfterTest
public void tearDown() {
	driver.close();
	report.endTest(test);
	report.flush();
}
@Test
public void ValidateTitl() {
	String title = driver.getTitle();
	System.out.println(title);
}
@Test
public void GmailNavigate() {
	test.log(LogStatus.INFO,"Test case gmail navigate started");
	driver.findElement(By.linkText("Gmail")).click();
	test.log(LogStatus.WARNING,"Test case user sign In");
	driver.findElement(By.linkText("Sign in")).click();
	String title = driver.getTitle();
	System.out.println(title);
	test.log(LogStatus.PASS,title);
}

}
