package helperMethods;

import org.openqa.selenium.*;

public class ElementHelper {
    public WebDriver driver;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }

    //face click pe orice element vrei tu
    public void clickJSElement(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickJSElementByXpath(String path) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath(path));
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickJSElementById(String path) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath(path));
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void printTextElement(WebElement element) {
        //WebElement firstBlockELement= driver.findElement(By.id("sampleHeading"));
        //  System.out.println(firstBlockELement.getText());
        System.out.println(element.getText());
    }

    public void fillElement(WebElement element, String value){
        //firstNameElement.sendKeys(firstNameValue);
        element.sendKeys(value);
    }

    public void fillElement(WebElement element, Keys value){
        element.sendKeys(value);
    }
    public void pressElement(WebElement element, Keys value){
        element.sendKeys(value);
    }
}
