package Try;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLeafGroundTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Get the count of number of columns
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
		System.out.println(" Number of columns  " + findElements.size());

		// get the number of rows

		List<WebElement> findRowElements = driver.findElements(By.xpath(" //table[@id='table_id']//tr"));
		System.out.println(" Number of Rows  " + findRowElements.size());

		//Get the progress value of 'Learn to interact with Elements'
		WebElement progressValue = driver
				.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td"));
		System.out.println("Progress value :" + progressValue.getText());
		
		//Check the vital task for the least completed progress.
        List<Integer> vitalList = new ArrayList<Integer>();
		List<WebElement> leastProgress = driver.findElements(By.xpath(" //table[@id='table_id']//tr/td[2]"));
		for (int i = 0; i < leastProgress.size(); i++) {
			
			String text = leastProgress.get(i).getText();
			String replaceAll = text.replaceAll("%", "");
			int parseInt = Integer.parseInt(replaceAll);
			System.out.println(parseInt);
			vitalList.add(parseInt);
		}
		
		Integer min = Collections.min(vitalList);
		System.out.println(min);
		
		driver.findElement(By.xpath("//td[contains(text(),'"+min+"')]/following-sibling::td/input")).click();
		
		
		
		
		
	}

}
