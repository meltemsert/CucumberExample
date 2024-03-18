package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class AddAndEditPage extends BasePage{

    public SelenideElement addElement = $("#addNewRecordButton");
    public SelenideElement firstNameElement = $("#firstName");
    public SelenideElement lastNameElement = $("#lastName");
    public SelenideElement userEmailElement = $("#userEmail");
    public SelenideElement ageElement = $("#age");
    public SelenideElement salaryElement = $("#salary");
    public SelenideElement departmentElement = $("#department");
    public SelenideElement submitElement = $("#submit");
    public SelenideElement editElement = $("#edit-record-4");
    public SelenideElement newSalaryElement = $("#salary");

    public void testAddAndRecordInWebTable(String name, String lastname, String email,
                                           String age, String salary, String department) {

        firstNameElement.setValue(name);
        lastNameElement.setValue(lastname);
        userEmailElement.setValue(email);
        ageElement.setValue(age);
        salaryElement.setValue(salary);
        departmentElement.setValue(department);
        submitElement.click();
    }

    public void testAddAndEditRecordInWebTable(String newSalary) {
        editElement.click();
        newSalaryElement.setValue(newSalary);
    }
    public AddAndEditPage(String pageUrl) {
        super(pageUrl);
    }
}
