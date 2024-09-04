import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
	driver.get("http://www.google.com");
	
	}

}
