package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.IndexPage;
import pages.WebTablePage;
import sharedData.SharedData;

import java.util.List;

public class WebTablesTest extends SharedData {

        @Test

        public void testMethod () {
//                ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
//                AlertHelper alertHelper = new AlertHelper(driver);
//                PageHelper pageHelper= new PageHelper(driver);
                IndexPage indexPage = new IndexPage(getDriver());
                indexPage.interactWithElementsMenu();

                ElementsPage elementsPage = new ElementsPage(getDriver());
                elementsPage.interactWithWebTablesSubMenu();

        int tableSize = 3;
//
        String firstnameValue = "Andreea";

        String lastnameValue = "Iurean";

        String emailValue = "test@test.com";

        String ageValue = "27";

        String salaryValue = "2500";

        String departamentValue = "financiar";

        String editFirstNameValue = "Andreea";
//
//
        String editLastNameValue = "Iurean";

//
        String editemailValue = "test@test.com";
//
//        WebElement editageElement = driver.findElement(By.id("age"));
        String editageValue = "27";

        String editsalarylValue = "2500";
//
        String editdepartmentValue = "financiar";
//

//
                WebTablePage webTablePage = new WebTablePage(getDriver());
                webTablePage.addNewEntry(tableSize, firstnameValue, lastnameValue, emailValue, ageValue,salaryValue, departamentValue);

                webTablePage.editNewEntry(tableSize, editFirstNameValue,editLastNameValue, editemailValue ,editageValue, editsalarylValue, editdepartmentValue);
                webTablePage.deleteNewEntry(tableSize);
    }
}
