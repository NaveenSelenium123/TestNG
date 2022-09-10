package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	WebDriver driver;
    @BeforeMethod
	public void beforeClass() {
	WebDriverManager.edgedriver().setup();
    	//WebDriverManager.chromedriver().setup();
	 driver =new EdgeDriver();
    	//driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
	}
    @AfterMethod
    public void afterClass() {
		driver.close();
    }
    @Test(dataProvider="SampleData")
    public void tc(String email,String pass) {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
    @DataProvider(name="SampleData")
    public Object[][] data() {
		return new Object[][] {
			{"user1","test123"},
			{"user12","test1230"},
			{"user13","test1235"},
			{"user14","test12433"}
		};

	}
}
