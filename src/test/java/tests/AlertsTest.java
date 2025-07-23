package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.AlertPage;
import pages.IndexPage;
import sharedData.SharedData;

public class AlertsTest extends SharedData {

    @Test
    public void testMethod() {

//        driver.get("https://demoqa.com/");
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithAlertSFrameWindowMenu();



//        ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
//        AlertHelper alertHelper = new AlertHelper(driver);
//        PageHelper pageHelper= new PageHelper(driver);

//        WebElement alertsFrameWindowsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        elementHelper.clickJSElement(alertsFrameWindowsElement);

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.interactWithAlertsSubMenu();

//        WebElement alertsElement = driver.findElement(By.xpath("//span[text()='Alerts']"));
//        elementHelper.clickJSElement(alertsElement);
//       // elementHelper.clickJSElementByXpath("//span[text()='Alerts']");

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.dealAlertOk();
        alertPage.dealAlertTimer();
        alertPage.dealAlertCancel();
        alertPage.dealAlertPrompt("Formula1");


//        WebElement alertOkButtonElement = driver.findElement(By.id("alertButton"));
//        elementHelper.clickElement(alertOkButtonElement);

//        Alert alertOk = driver.switchTo().alert();
//        alertOk.accept();
//        alertHelper.acceptAlert();
//        pageHelper.scrollPage(0,400);

//        WebElement alertWaitButtonElement= driver.findElement(By.id("timerAlertButton"));
//        elementHelper.clickElement(alertWaitButtonElement);
//
//        alertHelper.acceptAlert();

        //wait explicit pt alerta, explicit are o conditie dupa care sa astepte(o alerta)// ce a fost inainte
//        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());

//        Alert alertWait=driver.switchTo().alert();
//        alertWait.accept();

//        pageHelper.scrollPage(0,400);
//
//        WebElement alertOkCancelElement= driver.findElement(By.id("confirmButton"));
//        elementHelper.clickElement(alertOkCancelElement);
//
//        alertHelper.dismissAlert();
//
//        Alert alertOkCancel = driver.switchTo().alert();
//        alertOkCancel.dismiss();
//
//        WebElement alertPromptElement= driver.findElement(By.id("promtButton"));
//        elementHelper.clickElement(alertPromptElement);
//
//        Alert alertPrompt= driver.switchTo().alert();  //ce am avut inainte
//        alertPrompt.sendKeys("Formula1");
//        alertPrompt.accept();
//        alertHelper.fillAlert("Formula1");
//
//       //driver.quit();

    }
}
