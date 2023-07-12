//package stepDefinitions;
//
//import java.util.Map;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.LoginPage;
//
//
//
////data table with maps : for parameterization of test cases
//
//public class DealsStepWithMapDefinition {
//
//	WebDriver driver;
//	//LoginPage lp = new LoginPage();
//
//	@Given("^user is already on Login Page$")
//	public void user_already_on_login_page() {
//		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
//		driver = new FirefoxDriver(); 
//		driver.get("https://ui.cogmento.com/");
//	}
//
//	@When("^title of login page is Cogmento CRM$")
//	public void title_of_login_page_is_Cogmento_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//
//			driver.findElement(By.name("email")).sendKeys(data.get("email"));
//			driver.findElement(By.name("password")).sendKeys(data.get("password"));
//
//		}
//
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//	}
//
//
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deals_page() {
//		//lp.clickOnDealsLink();
//		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//
//	} 
//	
//	@Then("click on create button")
//	public void click_on_create_button() {
//		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_contacts_details(DataTable dealData) {
//
//		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
//
//			driver.findElement(By.name("title")).sendKeys(data.get("title"));
//			driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
//			driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
//			driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
//			
//			driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//			
//			//move to new deal page:
////			Actions action = new Actions(driver);
////			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
////			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//
//		}
//
//		
//	}
//	
//	
//	@Then("^Close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}