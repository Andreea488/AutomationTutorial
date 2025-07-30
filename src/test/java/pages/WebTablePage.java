package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTablePage extends BasePage {

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='rt-tr -even'or @class='rt-tr -odd']")
    private List<WebElement> tableList;
    @FindBy(id = "addNewRecordButton")
    private WebElement addElement;
    @FindBy(id = "firstName")
    private WebElement firstnameElement;
    @FindBy(id = "lastName")
    private WebElement lastnameElement;
    @FindBy(id = "userEmail")
    private WebElement emailElement;
    @FindBy(id = "age")
    private WebElement ageElement;
    @FindBy(id = "salary")
    private WebElement salaryElement;
    @FindBy(id = "department")
    private WebElement departamentElement;
    @FindBy(id = "submit")
    private WebElement submitElement;
    @FindBy(id = "edit-record-4")
    private WebElement editElement;
    @FindBy(id = "firstName")
    private WebElement editfirstnameElement;
    @FindBy(id = "lastName")
    private WebElement editlastnameElement;
    @FindBy(id = "userEmail")
    private WebElement editemailElement;
    @FindBy(id = "age")
    private WebElement editageElement;
    @FindBy(id = "salary")
    private WebElement editsalaryElement;
    @FindBy(id = "department")
    private WebElement editdepartamentElement;
    @FindBy(id = "delete-record-4")
    private WebElement deleteElement;

    public void addNewEntry(int tableSize, String firstNameValue, String lastNameValue, String emailValue, String ageValue, String salaryValue, String departmentValue) {
        elementHelper.validateListSize(tableList, tableSize);
        LoggerUtility.infoLog(("The user validates that the table has" + tableSize+ " rows"));
        clickAddButton();
        fillFirstName(firstNameValue);
        fillLastName(lastNameValue);
        fillEmail(emailValue);
        fillAge(ageValue);
        fillSalary(salaryValue);
        fillDepartment(departmentValue);
        clickSubmit();

        int expectedTableSize=tableSize+1;
        elementHelper.validateListSize(tableList, expectedTableSize);
        LoggerUtility.infoLog(("The user validates that the table has "+ expectedTableSize+ "rows"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), firstNameValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + firstNameValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), lastNameValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + lastNameValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), emailValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + emailValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), ageValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + ageValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), salaryValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + salaryValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), departmentValue);
       LoggerUtility.infoLog(("The user validate that the table contains " + departmentValue+ "value"));
    }

    public void editNewEntry(int tableSize, String editFirstNameValue, String editLastNameValue, String editemailValue, String editageValue, String editsalarylValue, String editdepartmentValue) {
        clickEditButton();
        fillEditFirstName(editFirstNameValue);
        fillEditLastName(editLastNameValue);
        fillEditEmail(editemailValue);
        fillEditAge(editageValue);
        fillEditSalary(editsalarylValue);
        fillEditDepartment(editdepartmentValue);
        clickSubmit();

        int expectedTableSize = tableSize+1;
        elementHelper.validateListSize(tableList, expectedTableSize);
        LoggerUtility.infoLog(("The user validates that the table has "+ expectedTableSize + "rows"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), editFirstNameValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + editFirstNameValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), editLastNameValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + editLastNameValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), editemailValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + editemailValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), editageValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + editageValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), editsalarylValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + editsalarylValue+ "value"));
        elementHelper.validateElementContainsText(tableList.get(tableSize), editdepartmentValue);
        LoggerUtility.infoLog(("The user validate that the table contains " + editdepartmentValue+ "value"));

    }

    public void deleteNewEntry(int tableSize) {
        clickDeleteButton();
        elementHelper.validateListSize(tableList, tableSize);
        LoggerUtility.infoLog(("The user validates that the table has "+ tableSize+ "rows"));

    }

    public void clickAddButton() {
        elementHelper.clickElement(addElement);
        LoggerUtility.infoLog(("The user clicks on add button"));
    }

    public void fillFirstName(String firstNameValue) {
        elementHelper.clearFillElement(firstnameElement, firstNameValue);
        LoggerUtility.infoLog(("The user fills first name field with value" + firstNameValue));
    }

    public void fillLastName(String lastNameValue) {
        elementHelper.clearFillElement(lastnameElement, lastNameValue);
        LoggerUtility.infoLog(("The user fills last name field with value" + lastNameValue));
    }

    public void fillEmail(String emailValue) {
        elementHelper.clearFillElement(emailElement, emailValue);
        LoggerUtility.infoLog(("The user fills email field with value" + emailValue));
    }

    public void fillAge(String ageValue) {
        elementHelper.clearFillElement(ageElement, ageValue);
        LoggerUtility.infoLog(("The user fills age field with value" + ageValue));
    }

    public void fillSalary(String salaryValue) {
        elementHelper.clearFillElement(salaryElement, salaryValue);
        LoggerUtility.infoLog(("The user fills salary field with value" + salaryValue));
    }

    public void fillDepartment(String departmentValue) {
        elementHelper.clearFillElement(departamentElement, departmentValue);
        LoggerUtility.infoLog(("The user fills department field with value" + departmentValue));
    }

    public void clickSubmit() {
        elementHelper.clickElement(submitElement);
        LoggerUtility.infoLog(("The user clicks on submit button"));
    }

    public void clickEditButton() {
        elementHelper.clickJSElement(editElement);
        LoggerUtility.infoLog(("The user clicks on edit button"));
    }

    public void fillEditFirstName(String firstNameValue) {
        elementHelper.clearFillElement(editfirstnameElement, firstNameValue);
        LoggerUtility.infoLog(("The user fills first name field with value" + firstNameValue));
    }

    public void fillEditLastName(String lastNameValue) {
        elementHelper.clearFillElement(editlastnameElement, lastNameValue);
        LoggerUtility.infoLog(("The user fills last name field with value" + lastNameValue));
    }

    public void fillEditEmail(String emailValue) {
        elementHelper.clearFillElement(editemailElement, emailValue);
        LoggerUtility.infoLog(("The user fills email field with value" + emailValue));
    }

    public void fillEditAge(String ageValue) {
        elementHelper.clearFillElement(editageElement, ageValue);
        LoggerUtility.infoLog(("The user fills age field with value" + ageValue));
    }

    public void fillEditSalary(String salaryValue) {
        elementHelper.clearFillElement(editsalaryElement, salaryValue);
        LoggerUtility.infoLog(("The user fills salary field with value" + salaryValue));
    }

    public void fillEditDepartment(String departmentValue) {
        elementHelper.clearFillElement(editdepartamentElement, departmentValue);
        LoggerUtility.infoLog(("The user fills department field with value" + departmentValue));
    }
    public void clickDeleteButton(){
        elementHelper.clickJSElement(deleteElement);
        LoggerUtility.infoLog(("The user clicks on delete button"));
    }
}

