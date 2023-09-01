package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
	     Thread.sleep(3000);
	     driver.findElement(By.name("firstname")).sendKeys("selenium");
	     Thread.sleep(3000);
	     driver.findElement(By.id("sex-1")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.id("profession-0")).click();
	     driver.findElement(By.id("profession-1")).click();
	     Thread.sleep(3000);
	     WebElement continentSelector=driver.findElement(By.id("continents"));
	     System.out.println(continentSelector);
	     Select continent=new Select(continentSelector);
	     continent.selectByVisibleText("Antartica");
	     Thread.sleep(3000);
	     continent.selectByIndex(2);
	     Thread.sleep(3000);
	     driver.findElement(By.partialLinkText("Click here to Down")).click();
	    
	}

}
