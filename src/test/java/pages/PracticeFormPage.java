package pages;

import helperMethods.ElementHelper;
import helperMethods.FrameHelper;
import helperMethods.PageHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.List;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceForm;
    @FindBy(css = "input[placeholder='First Name']")
    private WebElement firstNameElement;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameElement;
    @FindBy(css = "input[placeholder='name@example.com']")
    private WebElement emailElement;
    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement mobileElement;
    @FindBy(id = "subjectsInput")
    private WebElement subjectsElement;
    @FindBy(css = "div[id='genterWrapper']>div>div>label[class='custom-control-label']")
    private List<WebElement> genderElementList;
    @FindBy(css = "div[id='hobbiesWrapper']>div>div>label[class='custom-control-label']")
    private List<WebElement> hobbiesElementList;
    @FindBy(id = "uploadPicture")
    private WebElement uplodElement;
    @FindBy(id = "currentAddress")
    private WebElement currentAdressElement;
    @FindBy(id = "state")
    private WebElement stateElement;
    @FindBy(id = "react-select-3-input")
    private WebElement stateInputElement;
    @FindBy(id = "react-select-4-input")
    private WebElement cityElement;
    @FindBy(id = "react-select-4-input")
    private WebElement cityInputElement;
    @FindBy(id = "submit")
    private WebElement submitElement;
    @FindBy(xpath = "//table//td[1]")
    private List<WebElement> tableDescriptionList;
    @FindBy(xpath = "//table//td[2]")
    private List<WebElement> tableValueList;

    public void fillEntireForm(String firstNameValue, String lastNameValue, String emailValue, String mobileValue, List<String> subjectsValue, String genderValue,
                               List<String> hobbiesValue, String uploadValue, String currentAddressValue, String stateValue, String cityValue) {
        elementHelper.fillElement(firstNameElement, firstNameValue);
        elementHelper.fillElement(lastNameElement, lastNameValue);
        elementHelper.fillElement(emailElement, emailValue);
        elementHelper.fillElement(mobileElement, mobileValue);
        for (int index = 0; index < subjectsValue.size(); index++) {
            elementHelper.fillPressElement(subjectsElement, subjectsValue.get(index), Keys.ENTER);
        }
        switch (genderValue) {
            case "Male":
                elementHelper.clickJSElement(genderElementList.get(0));
                break;
            case "Female":
                elementHelper.clickJSElement(genderElementList.get(1));
                break;
            case "Other":
                elementHelper.clickJSElement(genderElementList.get(2));
                break;
        }
        pageHelper.scrollPage(0, 400);

        for (int index = 0; index < hobbiesElementList.size(); index++) {
            if (hobbiesValue.contains(hobbiesElementList.get(index).getText())) {
                elementHelper.clickElement(hobbiesElementList.get(index));
            }
        }
        File file = new File(uploadValue);
        elementHelper.fillElement(uplodElement, file.getAbsolutePath());
        elementHelper.fillElement(currentAdressElement, currentAddressValue);
        elementHelper.clickJSElement(stateElement);
        elementHelper.fillPressElement(stateInputElement, stateValue, Keys.ENTER);
        elementHelper.clickJSElement(cityElement);
        elementHelper.fillPressElement(cityInputElement, cityValue, Keys.ENTER);
        elementHelper.clickJSElement(submitElement);
    }

    public void validateFormValues(String firstNameValue, String lastNameValue, String emailValue, String genderValue,
                                   String mobileValue, List<String> subjectsValue, List<String> hobbiesValue, String fileName, String currentAddressValue,
                                   String stateValue, String cityValue) {
        elementHelper.validateElementEqualsText(tableDescriptionList.get(0), "Student Name");
        elementHelper.validateElementContainsText(tableValueList.get(0), firstNameValue);
        elementHelper.validateElementContainsText(tableValueList.get(0), lastNameValue);

        elementHelper.validateElementEqualsText(tableDescriptionList.get(1), "Student Email");
        elementHelper.validateElementEqualsText(tableValueList.get(1), emailValue);

        elementHelper.validateElementEqualsText(tableDescriptionList.get(2), "Gender");
        elementHelper.validateElementEqualsText(tableValueList.get(2), genderValue);

        elementHelper.validateElementEqualsText(tableDescriptionList.get(3), "Mobile");
        elementHelper.validateElementEqualsText(tableValueList.get(3), mobileValue);

        String allSubjects = String.join(", ", subjectsValue);
        elementHelper.validateElementEqualsText(tableDescriptionList.get(5), "Subjects");
        elementHelper.validateElementEqualsText(tableValueList.get(5), allSubjects);

        String allHobies = String.join(", ", hobbiesValue);
        elementHelper.validateElementEqualsText(tableDescriptionList.get(6), "Hobbies");
        elementHelper.validateElementEqualsText(tableValueList.get(6), allHobies);

        File file = new File(fileName);
        elementHelper.validateElementEqualsText(tableDescriptionList.get(7), "Picture");
        elementHelper.fillElement(uplodElement, file.getAbsolutePath());

        elementHelper.validateElementEqualsText(tableDescriptionList.get(8), "Address");
        elementHelper.validateElementEqualsText(tableValueList.get(8), currentAddressValue);

        elementHelper.validateElementEqualsText(tableDescriptionList.get(9), "State and City");
        elementHelper.validateElementContainsText(tableValueList.get(9), stateValue);
        elementHelper.validateElementContainsText(tableValueList.get(9), cityValue);
    }
}
