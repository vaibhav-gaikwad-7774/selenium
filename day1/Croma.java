package day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Croma {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     driver.navigate().to("https://www.croma.com/");
	     Thread.sleep(3000);
	     driver.findElement(By.id("search")).sendKeys("Air Conditioner");
	     Thread.sleep(3000);
	     Actions act=new Actions(driver);
	     act.sendKeys(  driver.findElement(By.id("search")),Keys.ENTER);

	}

}
