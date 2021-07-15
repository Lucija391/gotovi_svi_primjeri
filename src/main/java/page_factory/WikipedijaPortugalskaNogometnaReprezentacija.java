package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPortugalskaNogometnaReprezentacija {
    WebDriver driver;

    @FindBy(id = "firstHeading")
    WebElement titleTextPortuglaskaNogometnaReprezentacija;

    @FindBy(id="searchInput")
    WebElement search;

    @FindBy(id="searchButton")
    WebElement searchButton;

    public WikipedijaPortugalskaNogometnaReprezentacija(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getTitleOfPortugalskaNogometnaReprezentacija(){
        return    titleTextPortuglaskaNogometnaReprezentacija.getText();
    }

    public void clickOnSearchInput(){
        search.click();
    }

    public void writeText(String searchInput){
        search.sendKeys(searchInput);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }
}
