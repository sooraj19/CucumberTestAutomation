package com.testautomationlibrary.cucumber.api.rest.stepdefinitions;

import com.testautomationlibrary.cucumber.api.rest.helpers.AssertionHelpers;
import com.testautomationlibrary.cucumber.api.rest.helpers.PetOperationHelpers;
import com.testautomationlibrary.cucumber.api.rest.models.Pet;
import com.testautomationlibrary.cucumber.api.rest.testdata.ValidData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class CreatePetStepDefinitions {

    Response createPetResponse;

    @When("^the user create a pet using default valid values$")
    public void createPetWithValidData() {

        createPetResponse = PetOperationHelpers.createPetWithFullResponse(ValidData.getFirstPet());
    }

    @Then("^the create pet end point should return http code (\\d+)$")
    public void verifyHttpResponseCode(int expectedResponseCode)  {

        Assert.assertEquals("Http response code should match..", expectedResponseCode, createPetResponse.getStatusCode());
    }

    @And("^the created pet values should match the input pet values$")
    public void verifyPetsAreTheSame()
    {
        AssertionHelpers.assertPetsAreEqual(ValidData.getFirstPet(), createPetResponse.getBody().as(Pet.class));
    }
}
