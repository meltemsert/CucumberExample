package steps;

import common.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

public class AddAndEditSteps extends BaseTest {

    PageManager pageManager = new PageManager();

    @Given("User visits the demoqa web tables page")
    public void userVisitsTheDemoqaWebTablesPage() {
        pageManager.addAndEditPage.openWebTables();
    }

    @When("User clicks on the ADD button")
    public void userClicksOnTheADDButton() {
        pageManager.addAndEditPage.addElement.click();
    }

    @And("User adds a new record")
    public void userAddsANewRecord() {
        pageManager.addAndEditPage.testAddAndRecordInWebTable(
                "Meltem",
                "Sert",
                "meltemsert29@gmail.com",
                "30",
                "50000",
                "EGM");
    }

    @And("User edits the added record")
    public void userEditsTheAddedRecord() {
        pageManager.addAndEditPage.testAddAndEditRecordInWebTable("55000");
    }

    @Then("User clicks submit button")
    public void userClicksSubmitButton() {
        pageManager.addAndEditPage.submitElement.click();
    }
}

