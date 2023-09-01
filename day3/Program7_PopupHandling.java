package day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7_PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();    
	     driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	     Thread.sleep(3000);
	     WebElement alertBtn=driver.findElement(By.xpath("//*[text()='Click for JS Alert']"));
	     alertBtn.click();
	     Alert alertBox=driver.switchTo().alert();
	     System.out.println(alertBox.getText());
	     Thread.sleep(3000);
	     alertBox.accept();
	     WebElement confirmBtn=driver.findElement(By.xpath("//*[text()='Click for JS Confirm']"));
	     confirmBtn.click();
	     Alert confirmBox=driver.switchTo().alert();
	     System.out.println(confirmBox.getText());
	     Thread.sleep(3000);
	     confirmBox.dismiss();
	     WebElement promptBtn=driver.findElement(By.xpath("//*[text()='Click for JS Prompt']"));
	     promptBtn.click();
	     Alert promptBox=driver.switchTo().alert();
	     System.out.println(promptBox.getText());
	     Thread.sleep(3000);
	     promptBox.sendKeys("hello");
	     Thread.sleep(3000);
	     promptBox.accept();
	     
	     
	     

	}

}
