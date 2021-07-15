package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPortalONogometu {

    WebDriver driver;

    @FindBy(xpath="//table//tr//td//div//p//big//b")
    WebElement titleTextPortalONogometu;

    @FindBy(xpath="//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr/td/div[6]/div[6]/center[1]/a/img")
    WebElement flag;

    public WikipedijaPortalONogometu(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        return    titleTextPortalONogometu.getText();
    }

    public void clickLink(){
        flag.click();
    }
}
