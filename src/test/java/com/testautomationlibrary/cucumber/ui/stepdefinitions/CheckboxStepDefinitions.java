package com.testautomationlibrary.cucumber.ui.stepdefinitions;

import com.testautomationlibrary.cucumber.ui.pages.CheckboxPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckboxStepDefinitions extends StepDefinition {

    CheckboxPage checkboxPage;

    @After
    public void cleanupDriver()
    {
        this.driver.quit();
    }

    @When("^the user navigates to check box page$")
    public void navigateToCheckboxPage() {

        this.checkboxPage = new CheckboxPage(driver);
        this.checkboxPage.goTo();
    }

    @And("checks the checkbox")
    public void checksTheCheckbox() {
        this.checkboxPage.toggleAgeCheckboxSelection();
    }

    @Then("the message {string} should be displayed")
    public void theMessageShouldBeDisplayed(String expectedMessage) {
        String actualMessage = this.checkboxPage.getOutputMessage();
        Assert.assertEquals("Checkbox toggle Message doesn't match..", expectedMessage, actualMessage);
    }
}
