package Try;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LedarnwindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("home")).click();

		// WINDOW HANDLE
		Set<String> windowHandles = driver.getWindowHandles();
		// Hanldes inserted in the order of the windows opened
		// handle1 - first
		// handle2 - second win
		List<String> winList = new ArrayList<String>(windowHandles);
		for (String eachString : winList) {
			System.out.println(eachString);
		}
				
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(winList.get(2));
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		System.out.println(driver.getTitle());
		// TestLeaf - Interact with Windows
		// TestLeaf - Selenium Playground
	}
}
