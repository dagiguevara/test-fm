package pages;

import org.openqa.selenium.WebDriver;

import pages.locators.HomePageLocators;

public class HomePage extends PageObject {
    
    private HomePageLocators locators = new HomePageLocators(driver);
    
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
    public void search(String textToSearch) {
        locators.searchBox.sendKeys(textToSearch);
        locators.searchButton.click();
    }
    
    public boolean isStatsResultsDisplayed () {
        return locators.stats.isDisplayed();
    }

}
