package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaGlavnaStranica {
    WebDriver driver;

    @FindBy (linkText="Šport")
    WebElement poveznicaSport;

    @FindBy (linkText="Glazba")
    WebElement poveznicaGlazba;

    @FindBy (linkText = "Prijavi se")
    WebElement poveznicaPrijava;

    @FindBy(className = "hp-dd-1")
    WebElement naslovGlavnaStranica;

    @FindBy(linkText="Odjavi se")
    WebElement poveznicaOdjava;

    @FindBy(id="pt-anonuserpage")
    WebElement loginStatus;

    @FindBy(id="pt-userpage")
    WebElement loginUser;

    public WikipedijaGlavnaStranica(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLink(){
        poveznicaSport.click();
    }

    public void chooseGlazba(){
        poveznicaGlazba.click();
    }

    public void choosePrijava(){
        poveznicaPrijava.click();
    }

    public String getTitle(){
        return naslovGlavnaStranica.getText();
    }

    public boolean checkOdjava(){
         return poveznicaOdjava.isDisplayed();
    }

    public void chooseOdjava(){
        poveznicaOdjava.click();
    }

    public boolean checkPrijava(){
        return poveznicaPrijava.isDisplayed();
    }

    public String getLoginStatus(){
        return loginStatus.getText();
    }

    public String getNameOfLoginUser(){
        return loginUser.getText();
    }


}
