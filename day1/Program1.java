package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://www.javatpoint.com/");
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     Thread.sleep(3000);
	     driver.navigate().to("https://www.javatpoint.com/aptitude/quantitative");
	     Thread.sleep(3000);
	     driver.navigate().back();
	     Thread.sleep(3000);
	     driver.navigate().forward();
	     Thread.sleep(3000);
	     driver.navigate().refresh();

	}

}
