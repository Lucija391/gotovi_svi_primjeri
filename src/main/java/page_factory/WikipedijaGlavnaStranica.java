package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaGlavnaStranica {
    WebDriver driver;

    @FindBy (linkText="Šport")
    WebElement poveznicaSport;

    public WikipedijaGlavnaStranica(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLink(){
        poveznicaSport.click();
    }


}
