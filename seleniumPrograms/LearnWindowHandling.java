package Try;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("home")).click();
		
		Set<String> winSet = driver.getWindowHandles();
		int size = winSet.size();
		System.out.println(size);
		for (String eachWin : winSet) {
			System.out.println(eachWin);
		}
		
		List<String> winList = new ArrayList<String>(winSet);
		driver.switchTo().window(winList.get(1));
		driver.findElement(By.xpath("//h5[text()='Edit']")).click();
		//driver.close();
		
		driver.switchTo().window(winList.get(0));
	    System.out.println(driver.getTitle());
	 //   driver.quit();
	    
	    driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	    Set<String> winSet1 = driver.getWindowHandles();
	    int size1 = winSet.size();
		System.out.println(size1);
		for (String eachWin : winSet) {
			System.out.println(eachWin);
		}


		
		
		
		
		
		
		
		

	}
}
