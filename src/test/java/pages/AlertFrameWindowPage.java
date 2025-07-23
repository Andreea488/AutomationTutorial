package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertFrameWindowPage extends BasePage {

    public AlertFrameWindowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsElements;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesElements;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement WindowsElement;

    public void interactWithAlertsSubMenu(){
        elementHelper.clickJSElement(alertsElements);
        LoggerUtility.infoLog("The user clicks on Alerts Sub Menu");
    }
    public void interactWithFramesSubMenu(){
        elementHelper.clickJSElement(framesElements);
    }
    public void interactWithWindowsSubMenu(){
        elementHelper.clickJSElement(WindowsElement);
    }
}
