package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver(); 
	}
	
	public void openLoginPage() {
		driver.get("https://ui.cogmento.com/");
	}
	
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterEmailAndPassword(String a, String b) {
		driver.findElement(By.name("email")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
	}
	
	public void clickOnContactsLink() {
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
	}
	
	public void clickOnContacts() {
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		
	}
	
	public void clickOnDealsLink() {
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		
	}
	
	public void clickOnDeals() {
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		
	}
	
	public void enterDetails(String a, String b, String c) {
		driver.findElement(By.name("title")).sendKeys(a);
		driver.findElement(By.name("amount")).sendKeys(b);
		driver.findElement(By.name("probability")).sendKeys(c);
	}
	
	public void clickOnSaveButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		Thread.sleep(2000);
	}
		
	public void closeBrowser() {
		driver.quit();
	}
}
