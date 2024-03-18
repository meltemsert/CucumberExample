package steps;

import common.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonSteps extends BaseTest {
    PageManager pageManager = new PageManager();

    @Given("User is on demoqa elements page")
    public void userIsOnDemoqaElementsPage() {
        pageManager.buttonPage.open();
    }

    @When("User clicks on Buttons section")
    public void userClicksOnButtonsSection() {
        pageManager.buttonPage.clickButton();
    }

    @And("User clicks on Click Me button")
    public void userClicksOnClickMeButton() {
        pageManager.buttonPage.clickMeButton();
    }

    @Then("User should read the displayed message")
    public void userShouldReadTheDisplayedMessage() {
        String actualText = pageManager.buttonPage.readMessageElement.getText();
        String expectedText = "You have done a dynamic click";
        assertThat(actualText).isEqualTo(expectedText);
    }
}
