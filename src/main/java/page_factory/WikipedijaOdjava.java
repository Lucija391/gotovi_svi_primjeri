package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaOdjava {
    WebDriver driver;

    @FindBy (xpath="//*[@id=\"firstHeading\"]")
    WebElement titleOdjava;

    public WikipedijaOdjava(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
        return titleOdjava.getText();
    }
}
