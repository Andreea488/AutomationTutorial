package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {
//    public WebDriver driver;
//    public ElementHelper elementHelper;

    public IndexPage(WebDriver driver){
        super(driver);
//        this.driver = driver;
//        elementHelper = new ElementHelper(driver);
//        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement elementAlertsFrameWindows;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsMenu;
    @FindBy(xpath = "//h5[text()='Forms']" )
    private WebElement formsMenu;

    public void interactWithAlertSFrameWindowMenu(){
        elementHelper.clickJSElement(elementAlertsFrameWindows);
    }
    public void interactWithElementsMenu(){
        elementHelper.clickJSElement(elementsMenu);
    }
    public void interactWithFormsMenu(){
        elementHelper.clickElement(formsMenu);
    }

}
