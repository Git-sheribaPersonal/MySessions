package Try;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 * Select the frame:
		 * 1. using the frame Index (zero based index)
		 * 2. using the id or name (string]
		 * 3. using the frame as a webelement
		 */
		
		// NoSuchFrameException: driver.switchTo().frame(6);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
		// nested frame
		driver.switchTo().frame(1);	
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
	//	driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
	//	driver.switchTo().frame(2);	
	//	driver.switchTo().frame("frame2");
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println(size);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
	}
}
