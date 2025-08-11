package tests;

import org.testng.annotations.Test;
import pages.FormsPage;
import pages.IndexPage;
import pages.PracticeFormPage;
import sharedData.SharedData;
import suite.Suite;

import java.util.Arrays;
import java.util.List;


public class PracticeFormTest extends SharedData {

    @Test(groups = {Suite.REGRESSION_SUITE,Suite.FORM_SUITE})

    public void testMethod() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithFormsMenu();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.interactWithPracticeFormSubMenu();

        String firstNameValue = "Andreea";
        String lastNameValue = "Iurean";
        String emailValue = "test@test.com";
        String mobileValue = "0723456123";
        List<String> subjectsValue = Arrays.asList("Accounting", "Arts", "Maths");
        String genderValue = "Female";
        List<String> hobbiesValue = Arrays.asList("Reading", "Music");
        String path = "src/test/resources";
        String currentAddressValue = "Str. Campului nr 20 et 5";
        String stateValue = "Uttar Pradesh";
        String cityValue = "Lucknow";

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.fillEntireForm(firstNameValue, lastNameValue, emailValue, mobileValue, subjectsValue, genderValue, hobbiesValue, path,
                currentAddressValue, stateValue, cityValue);

        practiceFormPage.validateFormValues(firstNameValue, lastNameValue, emailValue, genderValue, mobileValue, subjectsValue, hobbiesValue,
                path, currentAddressValue, stateValue, cityValue);

    }
}



