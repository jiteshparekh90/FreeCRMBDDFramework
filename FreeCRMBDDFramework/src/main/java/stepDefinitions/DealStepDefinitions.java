package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class DealStepDefinitions {

	WebDriver driver;
	LoginPage lp = new LoginPage();
	// ContactsPage cp = new ContactsPage();

	@Given("^user is already on Login Page$")
	public void user_is_already_on_login_page() {
		lp.openBrowser();
		lp.openLoginPage();
	}

	// Reg exp:
	// 1. \"([^\"]*)"
	// 2. \"(.*)\"

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) {
		String expectedTitle = title;
		String actualTitle = lp.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

//	@Then("^user enters username and password$")
//	// io.cucumber.datatable.DataTable dataTable
//	public void user_enters_username_and_password(DataTable credentials) {
//		List<String> data = credentials.row(0);
//		driver.findElement(By.name("username")).sendKeys(data.get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(1));
//		// lp.enterEmailAndPassword(email, password);
//	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) {
		lp.enterEmailAndPassword(email, password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		lp.clickOnLoginButton();
	}

	@Then("user moves to new deal Page")
	public void user_moves_to_new_deal_page() {
		lp.clickOnDealsLink();
	}

	@Then("click on create button")
	public void click_on_create_button() {
		lp.clickOnDeals();
	}

	
	@Then("user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String title, String amount, String probability) {
	    lp.enterDetails(title, amount, probability);
	}
	
	
//	@Then("user enters deal details")
//	public void user_enters_deal_details(DataTable dealData) {
//		List<String> dealValues = dealData.row(0);
//
//		driver.findElement(By.name("title")).sendKeys(dealValues.get(0));
//		driver.findElement(By.name("amount")).sendKeys(dealValues.get(1));
//		driver.findElement(By.name("probability")).sendKeys(dealValues.get(2));
//	}

	@Then("user clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		lp.clickOnSaveButton();
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
		lp.closeBrowser();
	}

}
