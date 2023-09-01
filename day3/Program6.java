package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();    
	     driver.navigate().to("https://www.globalsqa.com/#Trainings");
	     Thread.sleep(3000);
	     WebElement trainings = driver.findElements(By.xpath("//*[@class ='aqua_table']")).get(1);
			List<WebElement>rows = trainings.findElements(By.tagName("tr"));
		//	System.out.println(rows.size());
			WebElement lastrow = rows.get(5);
			List<WebElement>rowData = lastrow.findElements(By.tagName("td"));
			for(WebElement td:rowData)
			{
				System.out.print(td.getText()+" ");
			}

	}

}
