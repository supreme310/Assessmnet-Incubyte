package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DriverInstance.Drivers;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.java.BeforeStep;

public class HookUpClass extends Drivers {
		//WebDriver driver;

	@Before
	public void beforeScenario(Scenario sce) {
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Create an Account")).click();
	}

	@After
	public void afterScenario(Scenario sce) {

		boolean failed = sce.isFailed();
		System.out.println("check failed or not" + failed);
		if (failed) {
			byte[] screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			sce.embed(screenshots, "image/png");
			
					}
		driver.quit();

	}

	@BeforeStep
	public void beforeStep(Scenario aft) {

		String id = aft.getId();
		System.out.println(id);
	}

	@AfterStep
	public void afterStep(Scenario aft1) {

		String id1 = aft1.getId();
		System.out.println(id1);
	}

}
