package ui;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Deletepackage {
		    public static void main(String[] args) {
		        // Set up ChromeDriver
		        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();

		        // Step 01: Login to the application
		        driver.get("https://ecs-qa.kloudship.com");
		        WebElement usernameInput = driver.findElement(By.id("username"));
		        usernameInput.sendKeys("kloudship.qa.automation@mailinator.com");
		        WebElement passwordInput = driver.findElement(By.id("password"));
		        passwordInput.sendKeys("Password1");
		        WebElement loginButton = driver.findElement(By.id("login-button"));
		        loginButton.click();

		        // Step 02: Navigate to Package Types
		        WebElement packageTypesLink = driver.findElement(By.linkText("https://ecs-qa.kloudship.com/package-types"));
		        packageTypesLink.click();

		        // Step 03: Delete the newly added package
		        WebElement newlyAddedPackage = driver.findElement(By.xpath("//table/tbody/tr[last()]"));
		        WebElement deleteButton = newlyAddedPackage.findElement(By.linkText("Delete"));
		        deleteButton.click();
		        driver.switchTo().alert().accept(); // Accept the confirmation alert

		        // Step 04: Logout the application
		        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		        logoutLink.click();

		         // Close the browser
		        driver.quit();
		    }
		}