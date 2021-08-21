package Try;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		boolean selected = driver.findElement(By.name("news")).isSelected();
		System.out.println(selected);
		
		boolean enabled = driver.findElement(By.name("news")).isEnabled();
		System.out.println(enabled);
		
		
		
	}
	
	
}
