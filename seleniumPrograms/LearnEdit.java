package Try;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("appending a text");
		
		String text2 = driver.findElement(By.xpath("//label[@for='uname']")).getText();
		System.out.println(text2);
		
		String text = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(text);
		
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		// (//input[@name='username'])[2]
		// 
		
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabled);
		
	}

}
