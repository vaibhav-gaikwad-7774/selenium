package day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\driver\\Feb\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     Scanner sc=new Scanner(System.in);
	     Register register=new Register();
	     driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	     while(true)
	     {
	    	 System.out.println("Press 1 to enter name");
	    	 System.out.println("Press 2 to enter last name");
	    	 System.out.println("Press 3 to enter email");
	    	 System.out.println("Press 4 to enter password");
	    	 int input=sc.nextInt();
	    	 switch(input)
	    	 {
	    	 case 1:
	    	 {	String firstname=sc.next();
		     	register.getName(driver).sendKeys(firstname);
		     	break;
	    	 }
	    	 case 2:
	    	 {	String lastname=sc.next();
		     	register.getLastName(driver).sendKeys(lastname);
		     	break;
	    	 }
	    	 case 3:
	    	 {	String email=sc.next();
		     	register.getEmail(driver).sendKeys(email);
		     	break;
	    	 }
	    	 case 4:
	    	 {	String password=sc.next();
		     	register.getPassword(driver).sendKeys(password);
		     	break;
	    	 }
	    	 }
	     }
	    
	    

	     

	     

	}

}
