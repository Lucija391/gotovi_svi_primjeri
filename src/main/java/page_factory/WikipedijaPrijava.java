package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPrijava {

    WebDriver driver;

    @FindBy (id = "firstHeading")
    WebElement titlePrijava;

    @FindBy(id="wpName1")
    WebElement username;

    @FindBy(id="wpPassword1")
    WebElement password;

    @FindBy(id="wpRemember")
    WebElement rememberCheckBox;

    @FindBy(id="wpLoginAttempt")
    WebElement submitLoginButton;

    public WikipedijaPrijava(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
        return titlePrijava.getText();
    }

    public void insertUsername(String usernameInput){
        username.clear();
        username.sendKeys(usernameInput);
    }

    public void insertPassword(String passwordInput){
        password.clear();
        password.sendKeys(passwordInput);
    }

    public void checkRemeberLoginData(){
        rememberCheckBox.click();
    }

    public void submitLoginData(){
        submitLoginButton.click();
    }


}
