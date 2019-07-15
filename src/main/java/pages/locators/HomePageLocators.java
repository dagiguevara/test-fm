package pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.PageObject;


public class HomePageLocators extends PageObject{
        
    public HomePageLocators(WebDriver driver) {
        super(driver);
    }
    
    @FindBy (name = "q")
    public WebElement searchBox;
    
    @FindBy (name = "btnK")
    public WebElement searchButton;
    
    @FindBy (id = "resultStats")
    public WebElement stats;
    
    
    
}

