package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertFrameWindowPage extends BasePage {
//    public WebDriver driver;
//    public ElementHelper elementHelper;

    public AlertFrameWindowPage(WebDriver driver) {
        super(driver);
//        this.driver = driver;
//        elementHelper = new ElementHelper(driver);
//        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertsElements;
    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement framesElements;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    public WebElement WindowsElement;

    public void interactWithAlertsSubMenu(){
        elementHelper.clickJSElement(alertsElements);
    }
    public void interactWithFramesSubMenu(){
        elementHelper.clickJSElement(framesElements);
    }
    public void interactWithWindowsSubMenu(){
        elementHelper.clickJSElement(WindowsElement);
    }
}
