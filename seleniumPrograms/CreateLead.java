package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Launch the url in the chosen browser
		// Load a new web page in the current browser window
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximise the screen
		driver.manage().window().maximize();
		// Locate the webeelemnt (DOM)
		WebElement webUsername = driver.findElement(By.id("username"));
		webUsername.sendKeys("demosalesmanager");
		
		// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		WebElement webPassword = driver.findElement(By.id("password"));
		webPassword.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Get the title of the current page. 
		String orgTitle = "Leaftaps - TestLeaf Automation Platform";
		String title = driver.getTitle();
		
		if(orgTitle.equals(title))
			System.out.println("Landed in the login page correctly ");
		else
			System.out.println("Incorrect landing of the page");
		
		// click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		// click on create lead link
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the cmpny name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaram");
		// Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		// click on Create lead button
		driver.findElement(By.className("smallSubmit")).click();
		// Verify if the view page occurs successfully
		// title : View Lead | opentaps CRM
		// To be done
		
		// Enter the Country Code 
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		Thread.sleep(2000);
		countryCode.sendKeys("2");
		
		
		
		
		
	}

}
