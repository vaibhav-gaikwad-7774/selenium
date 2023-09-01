package day1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class PracticeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();    
	     driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
	     Scanner sc=new Scanner(System.in);
	     String name=sc.nextLine();
	     /*driver.findElement(By.id("name")).sendKeys(name);
	     Long phone=sc.nextLong();
	     driver.findElement(By.id("phone")).sendKeys(phone+"");
	     String email=sc.next();
	     driver.findElement(By.id("email")).sendKeys(email);
	     int password=sc.nextInt();
	     driver.findElement(By.id("password")).sendKeys(password+"");
	     String gender=sc.next();
	     driver.findElement(By.id(gender)).click();
	     String day1=sc.next();
	     driver.findElement(By.id(day1)).click();
	     String day2=sc.next();
	     driver.findElement(By.id(day2)).click();
	     String countryChoice=sc.next();
	     Select country=new Select(driver.findElement(By.className("custom-select")));
	     country.selectByVisibleText(countryChoice);*/

	}

}
