package day1.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1:
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		String property = System.getProperty("webdriver.chrome.driver", "path");
		System.out.println(property);
		// Launch the url in the chosen browser
		// Load a new web page in the current browser window
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		// Maximise the screen
		driver.manage().window().maximize();
		// Locate the webeelemnt (DOM)

		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select drp1 = new Select(dd1);
		drp1.selectByIndex(1);

		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select drp2 = new Select(dd2);
		drp2.selectByVisibleText("UFT/QTP");

		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select drp3 = new Select(dd3);
		drp3.selectByValue("2");

		
		List<WebElement> options =  driver.findElements(By.xpath("//select[@class='dropdown']/option"));
		System.out.println("Size of the drop down:" + options.size());
		
		//WebElement dd5 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		WebElement dd5 = driver.findElement(By.className("dropdown"));
		Select drp5 = new Select(dd5);
		drp5.getOptions().size();
		System.out.println(" Options size: " + drp5.getOptions().size());
		
		
		
		// multiple options Mthd1
		WebElement dd4 = driver.findElement(By.xpath("//select[@multiple]"));
		Select drp4 = new Select(dd4);
		drp4.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		drp4.selectByVisibleText("Loadrunner");
		
		
		// To click the last option in the drop down list
		// cover during the list
		
		
		
	}

}
