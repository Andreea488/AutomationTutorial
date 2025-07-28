package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage{

    public FramesPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "sampleHeading")
    private WebElement firstBlockELement;
    @FindBy(id = "sampleHeading")
    private WebElement secondFrameElement;

    public void dealWithBigFrame(){
        frameHelper.switchFrameByElement(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        LoggerUtility.infoLog("The user switches to specific frame");
        elementHelper.printTextElement(firstBlockELement);
        frameHelper.switchToParent();
        LoggerUtility.infoLog("The user to specific parent frame");
    }
    public void dealWithLittleFrame(){
        frameHelper.switchFrameByString("frame2");
        elementHelper.printTextElement(secondFrameElement);
    }
}
