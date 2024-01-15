package scenarios;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
		public WebDriver driver;
		public Properties dataprop;

		@Given("^User ([a-zA-Z]{1,}) to LoginPage$")
		public void user_navigates_to_loginpage(String navigationMode) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click(); 

		}

		@When("^User enters valid email (.+) into email textbox field$")
		public void user_enters_valid_email_into_email_textbox_field(String validEmailText) {
			
			driver.findElement(By.id("input-email")).sendKeys(validEmailText);
		}

		@And("^User enters valid password (.+) into password textbox field$")
		public void user_enters_valid_password_into_password_textbox_field(String validPasswordText) {
			
			driver.findElement(By.id("input-password")).sendKeys(validPasswordText);
		}

		@And("User clicks on Login button")
		public void user_clicks_on_login_button() {
			
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();       
		}

		@Then("User is navigated to AccountPage")
		public void user_is_navigated_to_accountpage() {
			Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		}

}

