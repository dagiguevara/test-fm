package web_automation.projectx;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;



public class VerifySearch extends TestBase {
    
    
   
    @Test
    public void searhTest1() throws InterruptedException {
        HomePage page = new HomePage(getDriver());
        
        page.search("hello world");
        
        Assert.assertTrue(page.isStatsResultsDisplayed());
        
        Thread.sleep(4000);
    }
}
