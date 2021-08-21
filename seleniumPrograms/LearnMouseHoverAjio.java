package Try;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHoverAjio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Loads a new web page in the current browser window
		// Maximise the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		Actions builder = new Actions(driver);
		WebElement course = driver.findElement(By.linkText("TestLeaf Courses"));
		
		//builder.moveToElement(course).perform();
		builder.contextClick(course).perform();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		builder.dragAndDropBy(drag, 150	, 150).perform();
		
//		WebElement kids = driver.findElement(By.linkText("KIDS"));
		

		// Mouse Hover
	    //	builder.moveToElement(kids).perform();
		
			
		// rightclick
	//	builder.contextClick(kids).perform();
		
		
		
		
		
		
		
		
		
		
		

	}

}
