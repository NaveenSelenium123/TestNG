package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
WebDriver driver;
@Parameters({"browser"})
@Test
public void tc(String bwsr) {
	if(bwsr.equals("Chrome")){
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
	}
	else if(bwsr.equals("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(bwsr.equals("Mozile")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
//	driver.navigate().refresh();
//	driver.navigate().refresh();
//	driver.navigate().back();
//	driver.navigate().forward();
}
}
