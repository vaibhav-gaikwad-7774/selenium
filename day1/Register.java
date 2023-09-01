package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
	
	WebElement getName(WebDriver driver)
	{
		return driver.findElement(By.name("firstname"));
	}
	WebElement getLastName(WebDriver driver)
	{
		return driver.findElement(By.name("lastname"));
	}
	WebElement getEmail(WebDriver driver)
	{
		return driver.findElement(By.name("email"));
	}
	WebElement getPassword(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}

}
