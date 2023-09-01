package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1_TablePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();    
	     driver.navigate().to("https://www.globalsqa.com/#Trainings");
	     Thread.sleep(3000);
	   /*  JavascriptExecutor js= (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,-150)");  
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id='Tools']")).click();
	     Thread.sleep(3000);
	     WebElement tools=driver.findElement(By.tagName("table"));
	     List<WebElement>rows=tools.findElements(By.tagName("tr"));
	     WebElement lastRow=rows.get(5);
	     List<WebElement>rowData=lastRow.findElements(By.tagName("td"));
	     for(WebElement td:rowData)
	     {
	    	 System.out.print(td.getText()+" ");
	     }*/
	    // driver.findElement(By.xpath("//*[@class='aqua_table']")).click();
	     Thread.sleep(3000);
	     WebElement trainings=driver.findElements(By.xpath("(//*[@class='aqua_table'])")).get(1);
	     List<WebElement>rows2=trainings.findElements(By.tagName("tr"));
	     WebElement lastRow2=rows2.get(5);
	     List<WebElement>rowData2=lastRow2.findElements(By.tagName("td"));
	     for(WebElement td2:rowData2)
	     {
	    	 System.out.print(td2.getText()+" ");
	     }
	     
	     

	     

	}

}
