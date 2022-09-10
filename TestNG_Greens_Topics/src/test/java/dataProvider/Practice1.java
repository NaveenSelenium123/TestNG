package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	WebDriver driver;
    @BeforeMethod
	public void beforeClass() {
	WebDriverManager.edgedriver().setup();
	 driver =new EdgeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
	}
    @AfterMethod
    public void afterClass() {
		driver.close();
    }
    @Test(dataProvider="SampleData",dataProviderClass=Practice.class)
    public void tc(String email,String pass) {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
