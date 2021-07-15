package seleniumPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// IE, chrome, edge, safari, fire fox...

// INTRODUCTION ON THE INTERNAL ARCHITECTURE OF SELENUIM
// Selenium-java codes --> REST API ( Application Program Interface) 
//                     --> Driver (Local server)--> Browser(remote)

// driver version should be the same as the browser version

// Browser : Chromebrowser - Chromedriver (Google)
// Browser : FireFox       - GeckoDriver  (Mozilla)
// Browser : Edge          - EdgeDriver   (Microsoft)
// Browser : Safari        - Safaridiver   (Apple)

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set the chromedriver.exe to the java class
		
/*		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
        FirefoxDriver driverFox = new FirefoxDriver();
 */
		// Step 1: 
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Launch the url in the chosen browser
		// Load a new web page in the current browser window
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximise the screen
		driver.manage().window().maximize();
		// Locate the webeelemnt (DOM)
		
	}

}
