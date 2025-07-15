package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{
//    public WebDriver driver;
//    public ElementHelper elementHelper;
//    public AlertHelper alertHelper;
//    public PageHelper pageHelper;

    public AlertPage(WebDriver driver){
        super(driver);
//        this.driver = driver;
//        elementHelper = new ElementHelper(driver);
//        alertHelper = new AlertHelper(driver);
//        pageHelper = new PageHelper(driver);
//        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "alertButton")
    public WebElement alertOkButtonElement;
    @FindBy(id = "timerAlertButton")
    public WebElement alertWaitButtonElement;
    @FindBy(id = "confirmButton")
    public WebElement alertOkCancelElement;
    @FindBy(id = "promtButton")
    public WebElement alertPromptElement;

    public void dealAlertOk(){
        elementHelper.clickElement(alertOkButtonElement);
        alertHelper.acceptAlert();
    }
    public void dealAlertTimer(){
        elementHelper.clickElement(alertWaitButtonElement);
        alertHelper.acceptAlert();
        pageHelper.scrollPage(0,400);
    }
    public void dealAlertCancel(){
        elementHelper.clickElement(alertOkButtonElement);
        alertHelper.dismissAlert();
    }
    public void dealAlertPrompt(String value){
        elementHelper.clickElement(alertPromptElement);
        alertHelper.fillAlert(value);
    }
}
