package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.IndexPage;
import pages.WindowsPage;
import sharedData.SharedData;

public class WindowsTest extends SharedData {

    @Test

    public void testMethod() {
//        ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
//        TabHelper tabHelper= new TabHelper (driver);
        //driver.get("https://demoqa.com/");

        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactWithAlertSFrameWindowMenu();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(driver);
        alertFrameWindowPage.interactWithWindowsSubMenu();

        WindowsPage windowsPage = new WindowsPage(driver);
        windowsPage.dealWithNewTab();
        windowsPage.dealWithNewWindow();


//        WebElement alerstWindowsElement=driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//       // JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", alerstWindowsElement);
//        elementHelper.clickJSElement(alerstWindowsElement);
//
//        WebElement WindowsElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
//       // executor.executeScript("arguments[0].click();", WindowsElement);
//        elementHelper.clickJSElement(WindowsElement);

//        WebElement newtabElement= driver.findElement(By.id("tabButton"));
        //executor.executeScript("arguments[0].click();", newtabElement);
       // newtabElement.click();
 //       elementHelper.clickJSElement(newtabElement);
       // System.out.println(driver.getCurrentUrl());

//        tabHelper.switchToSpecificTab(1);

//        List<String> tabsList= new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabsList.get(1));
//        System.out.println(driver.getCurrentUrl());
        //inchidere tab
//        driver.close();
//        tabHelper.switchToSpecificTab(1);
//        tabHelper.closeCurrentTab();

//        driver.switchTo().window(tabsList.get(0));
//        System.out.println(driver.getCurrentUrl());

//        tabHelper.switchToSpecificTab(0);

        //din cauza reclamei fortam site-ul sa acceseze un URL specific
 //       driver.navigate().to("https://demoqa.com/browser-windows");

 //       WebElement newWindowElement=driver.findElement(By.id("windowButton"));
 //       newWindowElement.click();
 //       elementHelper.clickJSElement(newWindowElement);

//        System.out.println(driver.getCurrentUrl());

       // List<String> newWindowList= new ArrayList<>(driver.getWindowHandles());
//        tabHelper.switchToSpecificTab(1);
//        tabHelper.closeCurrentTab();
//        driver.switchTo().window(newWindowList.get(1));
//        System.out.println(driver.getCurrentUrl());
//        tabHelper.switchToSpecificTab(0);

       // driver.close();
       // driver.switchTo().window(newWindowList.get(0));
       // System.out.println(driver.getCurrentUrl());

        //driver.quit();


    }
}