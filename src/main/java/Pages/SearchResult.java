package Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.genericClass;

public class SearchResult extends genericClass{
	WebDriver driver;
	//Locators
	
	By tag_dealOfTheDay = By.xpath("//span[text()='Deal of the Day']");
	By tag_dealOfTheDay_items = By.xpath("//span[text()='Deal of the Day']/ancestor::div[contains(@class,'puis-padding-right-micro')]//h2");
	By tag_dealOfTheDay_price = By.xpath("//span[text()='Deal of the Day']/ancestor::div[contains(@class, 's-price-instructions-style')]//span[@class='a-price-whole']");
	
	
	
	
	
	
	public SearchResult(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void DealOfTheDayItems()
	{
		List<WebElement> priceList = driver.findElements(tag_dealOfTheDay_price);
		
		//for(WebElement obj :priceList)
		Iterator<WebElement> itr = priceList.iterator();
		int lowestPrice = 99999;
		
		while(itr.hasNext())
		{
			int price = Integer.parseInt(itr.next().getText().replace(",", ""));
			if(lowestPrice > price)
				lowestPrice = price;
			//System.out.println(itr.next().getText().replace(",", ""));
			//;
		}
		
		System.out.println("Lowest Item Price is: "+lowestPrice);
		
		
		
		
	}
	
	
	
	
	
}	
