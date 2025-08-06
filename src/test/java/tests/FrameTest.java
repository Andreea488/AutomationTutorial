package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.FrameHelper;
import helperMethods.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.FramesPage;
import pages.IndexPage;
import sharedData.SharedData;
import suite.Suite;

import java.time.Duration;

public class FrameTest extends SharedData {


    @Test(groups = {Suite.REGRESSION_SUITE,Suite.SANITY_SUITE, Suite.ALERTWINDOWFRAME_SUITE})
    public void testMethod() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithAlertSFrameWindowMenu();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.interactWithFramesSubMenu();

        FramesPage framesPage = new FramesPage(getDriver());
        framesPage.dealWithBigFrame();
        framesPage.dealWithLittleFrame();

    }
}

