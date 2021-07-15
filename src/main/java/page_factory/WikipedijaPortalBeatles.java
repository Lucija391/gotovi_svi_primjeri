package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPortalBeatles {
    WebDriver driver;

    @FindBy (id="firstHeading")
    WebElement titleBeatles;

    @FindBy(id="searchInput")
    WebElement search;

    @FindBy(className = "mw-searchSuggest-link")
    WebElement searchSuggestion;

    public WikipedijaPortalBeatles(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        return titleBeatles.getText();
    }

    public void clickOnSearchInput(){
        search.click();
    }

    public void writeText(String searchInput){
        search.sendKeys(searchInput);
    }

    public void chooseSuggestedOption(){
        searchSuggestion.click();
    }

}
