package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.genericClass;

public class HomePage extends genericClass{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//Locators
	By input_SearchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	

	public void SearchItem(String Item)
	{
		explecitwait(driver, "presenceOfElement", input_SearchBox);
		driver.findElement(input_SearchBox).click();
		driver.findElement(input_SearchBox).sendKeys(Item);
		driver.findElement(input_SearchBox).sendKeys(Keys.ENTER);
		
	}
	
	
	
}
