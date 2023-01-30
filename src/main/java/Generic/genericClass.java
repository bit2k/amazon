package Generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genericClass {
	WebDriver driver;
	
	public void explecitwait(WebDriver driver, String Condition, By locator)
	{
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(45));
		
		if(Condition.equalsIgnoreCase("presenceOfElement"))
		{
			ewait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		
	}
	
	
	
}
