package tests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonTest extends BaseTest{

    @Test
    public void readMessageText() {
        pageManager.buttonPage.open();
        pageManager.buttonPage.clickButton();
        pageManager.buttonPage.clickMeButton();
        String actualText = pageManager.buttonPage.readMessageElement.getText();
        String expectedText = "You have done a dynamic click";
        assertThat(actualText).isEqualTo(expectedText);

    }
}
