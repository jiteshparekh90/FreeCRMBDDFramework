package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage {
	WebDriver driver;
	
	public void clickOnContactsLink() {
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		
	}
	
	public void enterDetails(String a, String b, String c) {
		driver.findElement(By.name("first_name")).sendKeys(a);
		driver.findElement(By.name("last_name")).sendKeys(b);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(c);
	}
	
	public void clickOnSaveButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		Thread.sleep(2000);
	}
}
	
