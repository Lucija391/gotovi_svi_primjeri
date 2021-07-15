package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPortalSport {

    WebDriver driver;

    @FindBy(id = "firstHeading")
    WebElement titleText;

    @FindBy(linkText="Nogomet")
    WebElement poveznicaNogomet;

    public WikipedijaPortalSport(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        return    titleText.getText();
    }

    public void clickLink(){
        poveznicaNogomet.click();
    }
}
