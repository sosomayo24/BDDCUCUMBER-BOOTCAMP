package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.SpecialClasses.Util;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	public WebDriver driver;
	
	@Given("User navigates to the register page")
	public void user_navigates_to_register_page() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	

	@When("User enters mandatory fields")
	public void user_enters_below_mandatory_fields(io.cucumber.datatable.DataTable dataTable) {
	
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
	}

	
	@When("User selects Privacy Policy checkbox")
	public void user_selects_privacy_policy_checkbox() {
		driver.findElement(By.xpath("//input[@name = 'agree' and @value = '1']")).click(); 
	}
	
	@When("User clicks on the Continue button")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); 
	  
	}

	@Then("User account gets created successfully")
	public void user_account_gets_created_successfully() {
	 Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")).isDisplayed());
	}
	
	
}
