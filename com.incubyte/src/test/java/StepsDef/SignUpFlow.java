package StepsDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DriverInstance.Drivers;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpFlow extends Drivers {

	@When("User enter the firt Name as {string}")
	public void userEnterTheFirtNameAs(String Firastname) {
	//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='firstname']")));
		 
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Firastname);
	}

	@When("user enter trhe Last name as {string}")
	public void userEnterTrheLastNameAs(String Lastname) {
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(Lastname);

	}

	@When("user enter the Email id as {string}")
	public void userEnterTheEmailIdAs(String Email) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);

	}

	@When("user enter the Password {string}")
	public void userEnterThePassword(String password) {
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(password);

	}

	@When("User Reentering the Confirm Password as {string}")
	public void userReenteringTheConfirmPasswordAs(String conpass) {
		driver.findElement(By.xpath("(//input[@name='password_confirmation'])")).sendKeys(conpass);

	}

	@When("User click the Create an account button")
	public void userClickTheCreateAnAccountButton() {
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();

	}

	@Then("User should be redirected to the My account Screen")
	public void userShouldBeRedirectedToTheMyAccountScreen() {
		String loggedin = driver.findElement(By.xpath("//span[@class='base']")).getText();
		Assert.assertEquals(loggedin, "My Account");

	}

	@When("User click and enter the firt Name as {string}")
	public void UserclickandenterthefirtNameas(String Firastname) {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Firastname);
	}

	@When("user click and enter trhe Last name as {string}")
	public void userclickandEnterTrheLastNameAs(String Lastname) {
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(Lastname);

	}

	@When("user click and enter the Email id as {string}")
	public void userclickandEnterTheEmailIdAs(String Email) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);

	}

	@When("user click and enter the Password {string}")
	public void userclickandEnterThePassword(String password) {
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(password);

	}

	@When("User click and Reentering the Confirm Password as {string}")
	public void userclickandReenteringTheConfirmPasswordAs(String conpass) {
		driver.findElement(By.xpath("(//input[@name='password_confirmation'])")).sendKeys(conpass);

	}

	@When("User click on the Create an account button")
	public void userClickonTheCreateAnAccountButton() {
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();

	}

	
	@When("Error messag should be displyed")
	public void errorMessagShouldBeDisplyed() {
		String errormessage = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div"))
				.getText();
		Assert.assertEquals(errormessage,
				"There is already an account with this email address. If you are sure that it is your email address, "
						+ "click here to get your password and access your account.");
	}

}
