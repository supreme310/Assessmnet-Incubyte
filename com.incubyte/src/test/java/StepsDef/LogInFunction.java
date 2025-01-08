package StepsDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DriverInstance.Drivers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInFunction extends Drivers {
	

	@Given("user click on the signin link")
	public void userClickOnTheSigninLink() {
		
		
		driver.findElement(By.partialLinkText("Sign In")).click();

	}

	@Given("user enter the email {string}")
	public void userEnterTheEmail(String Email) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email );

	}

	@Given("user enter the password {string}")
	public void userEnterThePassword(String password) {
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys(password);
		
	}

	@When("User click on the sign in button")
	public void userClickOnTheSignInButton() {
		
		driver.findElement(By.xpath("//button[@class='action login primary']")).click();

	}

	@Then("user should be navigate to Home screen successfully")
	public void userShouldBeNavigateToHomeScreenSuccessfully() {
		String homepage = driver.findElement(By.xpath("//span[@class='base']")).getText();
		 Assert.assertEquals(homepage, "Customer Login");
		 {

	}

}
}
