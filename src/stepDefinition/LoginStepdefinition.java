package stepDefinition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefinition {
	WebDriver driver;
	@Given("^user should login to  vtiger application$")
	public void user_should_login_to_vtiger_application() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://localhost:8888/");
	    	}

	@When("^user should enter valid crendential$")
	public void user_should_enter_valid_crendential() {
	 
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("manager");
        driver.findElement(By.id("submitButton")).click();		
	}

	@Then("^homw page should be displayed$")
	public void homw_page_should_be_displayed() {
	 System.out.println(driver.getTitle());
	
	}

}
