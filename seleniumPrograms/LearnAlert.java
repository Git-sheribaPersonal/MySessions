package Try;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Inspect the webElement
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();

		// Switch the control from the main window to Alert
		// Simple Alert
		Alert alert = driver.switchTo().alert();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		// alert.dismiss();

		// Confirm Alert
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alert.dismiss();

		String txt = driver.findElement(By.id("result")).getText();
		System.out.println("Text in the Alert box: " + txt);

		// verify if OK or CANCEL is clicked

		if (txt.contains("OK")) {
			System.out.println(" OK button is pressed");
		} else if (txt.contains("Cancel")) {
			System.out.println(" Cancel button is pressed");
		}

		// Prompt Alert
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        alert.sendKeys("eduTech");
        alert.accept();
        
		//

	}

}
