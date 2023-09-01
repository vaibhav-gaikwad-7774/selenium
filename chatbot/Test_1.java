package chatbot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {
	 static WebDriver driver;
	static void initializeBrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     
	}
	static void login() 
	{
		try {
			driver.findElement(By.name("username")).sendKeys("abhishek@freshriver.ai");
		     Thread.sleep(5000);
		     driver.findElement(By.name("password")).sendKeys("vsxq)#n*TYwfFmH^");
		     Thread.sleep(5000);
		     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[2]/form/div[2]/button")).click();
		    
		}
		catch(Exception ex)
		{
			
		}
		 
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		initializeBrowser();
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();    
	     driver.get("https://collegeavestudentloans.dev.amelia.com/Amelia/chat");
	     login();
		 Thread.sleep(5000);
	     driver.findElements(By.className("DomainList-link")).get(1).click();
	     Thread.sleep(5000);
	     driver.findElement(By.tagName("textarea")).sendKeys("hello");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	    
	  

	}

}
