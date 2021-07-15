package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPortalGlazba {
    WebDriver driver;

    @FindBy(id="firstHeading")
    WebElement titleText;

    @FindBy(linkText = "Beatlesa")
    WebElement linkBeatles;

    public WikipedijaPortalGlazba(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        return    titleText.getText();
    }

    public void chooseLinkBeatles(){
        linkBeatles.click();
    }
}
