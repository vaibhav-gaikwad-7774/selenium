package day2;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

class FindElementsExample{
	public static void main(String args[]) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();    
	     driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
	     Thread.sleep(3000);
	     List<WebElement>days=driver.findElements(By.xpath("//label[@class='custom-control-label']"));
	     for(int i=5;i<=9;i=i+2)
	     {
	    	  days.get(i).click();
	     }
	}
}
	   