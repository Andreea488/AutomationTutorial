package tests;

import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.IndexPage;
import pages.WebTablePage;
import sharedData.SharedData;

public class WebTablesTest extends SharedData {

    @Test

    public void testMethod() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithElementsMenu();

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.interactWithWebTablesSubMenu();

        int tableSize = 3;
        String firstnameValue = "Andreea";
        String lastnameValue = "Iurean";
        String emailValue = "test@test.com";
        String ageValue = "27";
        String salaryValue = "2500";
        String departamentValue = "financiar";
        String editFirstNameValue = "Andreea";
        String editLastNameValue = "Iurean";
        String editemailValue = "test@test.com";
        String editageValue = "27";
        String editsalarylValue = "2500";
        String editdepartmentValue = "financiar";

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(tableSize, firstnameValue, lastnameValue, emailValue, ageValue, salaryValue, departamentValue);

        webTablePage.editNewEntry(tableSize, editFirstNameValue, editLastNameValue, editemailValue, editageValue, editsalarylValue, editdepartmentValue);
        webTablePage.deleteNewEntry(tableSize);
    }
}
