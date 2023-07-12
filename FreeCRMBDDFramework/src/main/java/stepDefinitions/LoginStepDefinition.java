//package stepDefinitions;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.LoginPage;
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//	LoginPage lp = new LoginPage();
//	//ContactsPage cp = new ContactsPage();
//	
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_login_page() {
//		lp.openBrowser();
//		lp.openLoginPage();
//	}
//	
// 	// Reg exp:
//	//1. \"([^\"]*)"
//	//2. \"(.*)\"
//	
//	
//	@When("^title of login page is \"([^\"]*)\"$")
//	public void title_of_login_page_is(String title) {
//	  String expectedTitle = title;
//	  String actualTitle = lp.getTitle();
//	  Assert.assertEquals(expectedTitle, actualTitle);
//	}
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String email, String password) {
//		lp.enterEmailAndPassword(email, password);
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		lp.clickOnLoginButton();
//	}
//	
//	@Then("user moves to new contact Page")
//	public void user_moves_to_new_contact_page() {
//	   lp.clickOnContactsLink();
//	}
//	
//	@Then("click on create button")
//	public void click_on_create_button() {
//	  lp.clickOnContacts();  
//	}
//	
//	@Then("user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and_and(String firstname, String lastname, String email) {
//	    lp.enterDetails(firstname, lastname, email);
//	}
//	
//	
//	@Then("user clicks on save button")
//	public void user_clicks_on_save_button() throws InterruptedException {
//		lp.clickOnSaveButton();
//	}
//	
//	
//	@Then("^user quit$")
//	public void user_quit() throws Throwable {
//	  lp.closeBrowser();
//	}
//
//	
//	/*@Then("^user is on home page$")
//	public void user_is_on_home_page(String title) {
//	   
//		String expectedTitle = title;
//		String actualTitle = lp.getTitle();
//		Assert.assertEquals(expectedTitle, actualTitle);
//		
//		String title = lp.getTitle();
//	    System.out.println("Home Page title ::"+ title);
//	    Assert.assertEquals("Cogmento CRM", title);
//		
//	}
//*/
//
//
//
//}
