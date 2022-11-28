package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBar;
	
	@FindBy(id="nav-search-submit-button")
	public WebElement searchButton;
	
	
	

}
