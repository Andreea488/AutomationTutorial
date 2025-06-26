package helperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementHelper {
    public WebDriver driver;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }
    //face click pe orice element vrei tu
    public void clickJSElement(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickELement(WebElement element){
        element.click();
    }
}
