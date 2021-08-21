package Try;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableJay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println("Number of rows:" + tableRows.size());
		
		// to ciunt the number of columns
		List<WebElement> tableCol = driver.findElements(By.xpath("//table//tr[1]/th"));
		System.out.println("Number of cols:" + tableCol.size());
		
		String text = driver.findElement(By.xpath("//table//td[text()='Learn Locators']/following-sibling::td[1]")).getText();
		System.out.println(" Locatros progress value:" + text);
		
		List<WebElement> colData = driver.findElements(By.xpath("//table//tr/td[2]"));
		System.out.println(" fifth col progress value:" + colData.size());
		
		for (int i = 0; i < colData.size(); i++) {
			System.out.println(colData.get(i).getText());
		}
		
		   /*     String = 100% 
				replace() -- remove %
				String - 100
				Integer.parseInt(100)
				int 100
				
				
				then find the least value
				30;
		        int min = 10;
		        int num = 80;
		        driver.findElement(By.xpath("//table//tr/td[contains(text(),"+min+")]"));*/
		        
		        
		        
		        
		        
		      //table//tr/td[contains(text(),80)]
				
				
				
				
	
		
		
		
		
	}

}
