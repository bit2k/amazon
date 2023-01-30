package Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.SearchResult;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class StepDefinition {
	WebDriver driver;
	
@Before
void setup()
{
	
}

@Given("User navigate to amazon.in site")
public void user_navigate_to_amazon_in_site() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    driver.get("https://www.amazon.in/");
}

@Given("Search for {string}")
public void search_for(String Item) {
	
	HomePage hp = new HomePage(driver);
	hp.SearchItem(Item);
	
	
}

@Then("find the shoes with Deal of the day tag")
public void find_the_shoes_with_deal_of_the_day_tag() {
	SearchResult sr = new SearchResult(driver);
	sr.DealOfTheDayItems();
}

@Then("List out the shoes and find the lowest Price show")
public void list_out_the_shoes_and_find_the_lowest_price_show() {
    
}

@When("User Click on the item and find the price")
public void user_click_on_the_item_and_find_the_price() {
    
}

}
