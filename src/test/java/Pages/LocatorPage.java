package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends Parent{
    public LocatorPage() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "//button[@type='button'][text()='Giriş Yap']")       private WebElement girisButton;
    @FindBy(xpath = "//input[@name='email']")                             private WebElement email;
    @FindBy(xpath = "//input[@name='password']")                          private WebElement password;
    @FindBy(xpath = "//button[@id=':r1h:']")                              private WebElement loginButton;
    @FindBy(xpath = "//button[@role='button']")                           private WebElement profileButton;





    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "girisButton": return this.girisButton;
            case "email": return this.email;
            case "password": return this.password;
            case "loginButton": return this.loginButton;
            case "profileButton": return this.profileButton;
        }
        return null;
    }


}