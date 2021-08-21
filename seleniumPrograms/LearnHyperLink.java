package Try;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		String actualTitle = driver.getTitle();
		
		// verify if it is in home page
		// title - check
		// TestLeaf - Selenium Playground
		String homeTitle = "TestLeaf - Selenium Playground";
		
		if (actualTitle.equals(homeTitle)) {
			System.out.println(" We are in Home page");
		}
		else {
			System.out.println(" Not in home page");
		}
		
		
		// step2
		// current context -- home page
		// get back to the hyperlink page
		driver.navigate().back();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(" Href:" + attribute);
		
		
		// Broken link -- HTTP Status 404 – Not Found
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title = driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("link is broken");
		}
		driver.navigate().back();
		// how many links
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in the page:"+ linkElements.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
