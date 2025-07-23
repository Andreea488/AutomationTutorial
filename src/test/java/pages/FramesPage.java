package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage{
//    public WebDriver driver;
//    public ElementHelper elementHelper;
//    public FrameHelper frameHelper;

    public FramesPage(WebDriver driver){
        super(driver);
//        this.driver = driver;
//        elementHelper = new ElementHelper(driver);
//        frameHelper = new FrameHelper(driver);
//        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "sampleHeading")
    private WebElement firstBlockELement;
    @FindBy(id = "sampleHeading")
    private WebElement secondFrameElement;

    public void dealWithBigFrame(){
//       frameHelper.switchFrameByElement(driver.findElement(By.xpath("//iframe[@id='frame1']"))); //se inlocuieste tot cu ce e mai jos
//       WebElement firstBlockELement = driver.findElement(By.id("sampleHeading"));
//       System.out.println(firstBlockELement.getText());
//       elementHelper.printTextElement(firstBlockELement);
        frameHelper.switchFrameByElement(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        elementHelper.printTextElement(firstBlockELement);
        frameHelper.switchToParent();
    }
    public void dealWithLittleFrame(){
//        frameHelper.switchFrameByString("frame2");
//        WebElement secondFrameElement= driver.findElement(By.id("sampleHeading"));
//        elementHelper.printTextElement(secondFrameElement);
        frameHelper.switchFrameByString("frame2");
        elementHelper.printTextElement(secondFrameElement);
    }
}
