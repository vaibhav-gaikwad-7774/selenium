package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3_GetMethods {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();    
	     driver.navigate().to("https://www.facebook.com/");
	     Thread.sleep(3000);
	     WebElement btn=driver.findElement(By.name("login"));
	     System.out.println(btn.getAccessibleName());
	     System.out.println(btn.getAriaRole());
	     System.out.println(btn.getAttribute("id"));
	     System.out.println(btn.getCssValue("color"));
	     System.out.println("************");
	     System.out.println(btn.getDomAttribute("class"));
	     System.out.println(btn.getDomProperty("innerHTML"));
	     System.out.println(btn.getTagName());
	     System.out.println(btn.getText());
	     System.out.println("************");
	     System.out.println(btn.getClass());
	     System.out.println(btn.isDisplayed());
	     System.out.println(btn.isEnabled());
	     System.out.println(btn.isSelected());
	     System.out.println("************");
	     System.out.println(btn.getLocation().getX());
	     System.out.println(btn.getRect().getHeight());
	  
	     
	     
	     
	    
	}

}
