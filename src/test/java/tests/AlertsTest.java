package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.PageHelper;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class AlertsTest extends SharedData {

    @Test
    public void testMethod() {

        ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
        AlertHelper alertHelper = new AlertHelper(driver);
        PageHelper pageHelper= new PageHelper(driver);

        WebElement alerstWindowsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementHelper.clickJSElement(alerstWindowsElement);

        WebElement alertsElement = driver.findElement(By.xpath("//span[text()='Alerts']"));
        elementHelper.clickJSElement(alertsElement);

        WebElement alertOkButtonElement = driver.findElement(By.id("alertButton"));
        elementHelper.clickELement(alertOkButtonElement);

//        Alert alertOk = driver.switchTo().alert();
//        alertOk.accept();
        alertHelper.acceptAlert();
       // pageHelper.scrollPage(0,400);

        WebElement alertWaitButtonElement= driver.findElement(By.id("timerAlertButton"));
        elementHelper.clickELement(alertWaitButtonElement);

        alertHelper.acceptAlert();

        //wait explicit pt alerta, explicit are o conditie dupa care sa astepte(o alerta)// ce a fost inainte
//        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());

//        Alert alertWait=driver.switchTo().alert();
//        alertWait.accept();

        pageHelper.scrollPage(0,400);

        WebElement alertOkCancelElement= driver.findElement(By.id("confirmButton"));
        elementHelper.clickELement(alertOkCancelElement);

        alertHelper.dismissAlert();

      //  Alert alertOkCancel = driver.switchTo().alert();
      //  alertOkCancel.dismiss();

        WebElement alertPromptElement= driver.findElement(By.id("promtButton"));
        elementHelper.clickELement(alertPromptElement);

//        Alert alertPrompt= driver.switchTo().alert();  //ce am avut inainte
//        alertPrompt.sendKeys("Formula1");
//        alertPrompt.accept();
        alertHelper.fillAlert("Formula1");

       //driver.quit();




    }
}
