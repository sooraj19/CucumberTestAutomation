package com.testautomationlibrary.cucumber.ui.stepdefinitions;

import com.testautomationlibrary.cucumber.ui.pages.MessageFormPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebBrowserNavigationStepDefinitions extends StepDefinition {

    MessageFormPage messageFormPage;

    @After
    public void cleanupDriver()
    {
        this.driver.quit();
    }

    @Given("^the user navigates to message form page$")
    public void navigateToPage()
    {
        this.messageFormPage = new MessageFormPage(driver);
        this.messageFormPage.goTo();
    }

    @When("^enters the message \"([^\"]*)\" into the text box$")
    public void enterMessage(String message)
    {
        this.messageFormPage.submitMessage(message);
    }

    @Then("^the entered \"([^\"]*)\" message should be displayed on the output label$")
    public void verifyExpectedMessageDisplayed(String expectedMessage)
    {
        String actualMessage = this.messageFormPage.getOutputMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
