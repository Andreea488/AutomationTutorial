package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.PageHelper;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.IndexPage;
import pages.PracticeFormPage;
import sharedData.SharedData;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    @Test

    public void testMethod() {
//       driver.get("https://demoqa.com/automation-practice-form");
//       ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
//        PageHelper pageHelper= new PageHelper(driver);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactWithFormsMenu();

        FormsPage formsPage = new FormsPage(driver);
        formsPage.interactWithPracticeFormSubMenu();

        String firstNameValue = "Andreea";
        String lastNameValue = "Iurean";
        String emailValue = "test@test.com";
        String mobileValue = "0723456123";
        List<String> subjectsValue = Arrays.asList("Accounting", "Arts", "Maths");
        String genderValue = "Female";
        List<String> hobbiesValue = Arrays.asList("Reading", "Music");
 //       String uploadValue = "src/test/resources;";
        String path = "src/test/resources";
//        String uploadValue = "poza1.jpg";
        String currentAddressValue = "Str. Campului nr 20 et 5";
        String stateValue = "Uttar Pradesh";
        String cityValue = "Lucknow";

        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.fillEntireForm(firstNameValue, lastNameValue, emailValue, mobileValue, subjectsValue, genderValue, hobbiesValue,path,
                currentAddressValue, stateValue, cityValue);

        practiceFormPage.validateFormValues(firstNameValue, lastNameValue, emailValue, genderValue,mobileValue, subjectsValue, hobbiesValue,
                path, currentAddressValue, stateValue, cityValue);

//        WebElement formsMenu = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        elementHelper.clickElement(formsMenu);
//
//        WebElement practiceForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        elementHelper.clickElement(practiceForm);
//
//        WebElement firstNameElement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//        String firstNameValue = "Andreea";
//       //firstNameElement.sendKeys(firstNameValue);
//        //elementHelper.pressElement(firstNameElement, Keys.ENTER);
//       elementHelper.fillElement(firstNameElement, firstNameValue);
//
//        WebElement lastNameElement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//        String lastNameValue = "Iurean";
//      // lastNameElement.sendKeys(lastNameValue);
//        elementHelper.fillElement(lastNameElement, lastNameValue);
//
//        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
//        String emailValue = "test@test.com";
//      //  emailElement.sendKeys(emailValue);
//        elementHelper.fillElement(emailElement, emailValue);
//
//        WebElement mobileElement = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
//        String mobileValue = "0723456123";
//        //mobileElement.sendKeys(mobileValue);
//        elementHelper.fillElement(mobileElement, mobileValue);
//
//        WebElement subjectsElement = driver.findElement(By.id("subjectsInput"));
//        List<String> subjectsValue = Arrays.asList("Accounting", "Arts", "Maths");
//        for (int index = 0; index < subjectsValue.size(); index++) {
////            elementHelper.fillElement(subjectsElement, subjectsValue.get(index));
////            elementHelper.pressElement(subjectsElement, Keys.ENTER);
//           // subjectsElement.sendKeys(subjectsValue.get(index));
//           // subjectsElement.sendKeys(Keys.ENTER);
//            elementHelper.fillPressElement(subjectsElement,subjectsValue.get(index), Keys.ENTER);
//        }
////        WebElement stateandCityElement = driver.findElement(By.id("react-select-3-input"));
////        String stateandCityValue = "NCR";
////        stateandCityElement.sendKeys(stateandCityValue);
////        stateandCityElement.sendKeys(Keys.ENTER);
//
//        String genderValue = "Female";
//        List<WebElement> genderElementList = driver.findElements(By.cssSelector("div[id='genterWrapper']>div>div>label[class='custom-control-label']"));
//        switch (genderValue) {
//            case "Male":
//               // genderElementList.get(0).click();
//                elementHelper.clickJSElement(genderElementList.get(0));
//                break;
//            case "Female":
//               // genderElementList.get(1).click();
//                elementHelper.clickJSElement(genderElementList.get(1));
//                break;
//            case "Other":
//               // genderElementList.get(2).click();
//                elementHelper.clickJSElement(genderElementList.get(2));
//                break;
//        }
//        //facem scroll in jos
//        //val pozitive merge in jos
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,400)");
//        pageHelper.scrollPage(0,400);
//
//        List<WebElement> hobbiesElementList = driver.findElements(By.cssSelector("div[id='hobbiesWrapper']>div>div>label[class='custom-control-label']"));
//        List<String> hobbiesValue = Arrays.asList("Reading", "Music");
//        for (int index = 0; index < hobbiesElementList.size(); index++) {
//            if (hobbiesValue.contains(hobbiesElementList.get(index).getText())) {
//                elementHelper.clickElement(hobbiesElementList.get (index));
//               // hobbiesElementList.get(index).click();
//            }
//        }
//        WebElement uplodElement = driver.findElement(By.id("uploadPicture"));
//        String path = "src/test/resources";
//        String uploadValue = "poza1.jpg";
//        File file = new File(path + "/" +uploadValue);
//        elementHelper.fillElement(uplodElement, file.getAbsolutePath());
//        //uplodElement.sendKeys(file.getAbsolutePath());
//
//        WebElement currentAdressElement = driver.findElement(By.id("currentAddress"));
//        String currentAddressValue = "Str. Campului nr 20 et 5";
//        elementHelper.fillElement(currentAdressElement, currentAddressValue);
//       // currentAdressElement.sendKeys(currentAddressValue);
//
//       //JavascriptExecutor executor = (JavascriptExecutor) driver;
//
//        WebElement stateElement = driver.findElement(By.id("state"));
////        executor.executeScript("arguments[0].click();", stateElement);
////        stateElement.click();
//        elementHelper.clickJSElement(stateElement);
//
//        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
//        String stateValue = "Uttar Pradesh";
//       // elementHelper.fillElement(stateInputElement, stateValue);
//        elementHelper.fillPressElement(stateInputElement, stateValue, Keys.ENTER);
////        stateInputElement.sendKeys(stateValue);
////        stateInputElement.sendKeys(Keys.ENTER);
//
//        WebElement cityElement = driver.findElement(By.id("react-select-4-input"));
//        //executor.executeScript("arguments[0].click();", cityElement);
//        elementHelper.clickJSElement(cityElement);
//
//        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
//        String cityValue = "Lucknow";
//        elementHelper.fillPressElement(cityInputElement, cityValue, Keys.ENTER);
//       // elementHelper.fillElement(cityInputElement, Keys.ENTER);
////        cityInputElement.sendKeys(cityValue);
////        cityInputElement.sendKeys(Keys.ENTER);
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        //executor.executeScript("arguments[0].click();", submitElement);
//        elementHelper.clickJSElement(submitElement);
//
//        //wait explicit
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//td[1]")));
////        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//td[1]")));
//
//        List<WebElement> tableDescriptionList= driver.findElements(By.xpath("//table//td[1]"));
//        List<WebElement> tableValueList =driver.findElements(By.xpath("//table//td[2]"));


       // driver.quit();
    }
}



