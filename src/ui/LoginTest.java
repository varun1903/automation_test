package ui;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class LoginTest {
	
	 public static void main(String[] args) {
		
	
        // Set up ChromeDriver
      
System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
WebDriver driver = new ChromeDriver(options);

// Step 01: Login to the application
driver.get("https://ecs-qa.kloudship.com");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement usernameInput = driver.findElement(By.id("mat-input-0"));
usernameInput.sendKeys("kloudship.qa.automation@mailinator.com");
WebElement passwordInput = driver.findElement(By.id("mat-input-1"));
passwordInput.sendKeys("Password1");
driver.findElement(By.xpath("//button[@type='submit']")).click();

// Step 02: Navigate to Package Types
driver.findElement(By.linkText("https://ecs-qa.kloudship.com/package-types")).click();

// Step 03: Click on Add Manually button
driver.findElement(By.xpath("//button[@aria-label='Add manually']")).click();

// Step 04: Add a package
Random random = new Random();
int dimension = random.nextInt(20);
WebElement packageNameInput = driver.findElement(By.id("mat-input-2"));
packageNameInput.sendKeys("FirstName_LastName");
WebElement packageDimensionInput = driver.findElement(By.id("mat-input-3"));
packageDimensionInput.sendKeys(String.valueOf(dimension));
driver.findElement(By.xpath("//button[@type='submit']")).click();

// Step 05: Logout
driver.findElement(By.xpath("//button[@aria-label='Logout']")).click();

// Close the browser
driver.quit();
}
}