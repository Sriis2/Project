package stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	WebDriver driver;
	@Test(priority=1) 
	public void browserLaunch() {
		System.out.println("Launch");
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void Login() {
		System.out.println("Login");
	}
	@Test(priority=3)
	public void validateUrl() {
		System.out.println("validateUrl");
	}@Test(priority=4)
	public void validatePageTitle() {
		System.out.println("validatePageTitle");
	}
	
	@Test(priority=5)
	public void Logout() {
		System.out.println("Logout");
	}
	@Test(priority=6)
	public void close() {
		System.out.println("close");
		driver.close();
	}@Test(priority=7)
	public void quit() {
		System.out.println("quit");
		driver.quit();
	}
}
