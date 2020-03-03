package com.testautomationlibrary.cucumber.api.rest.helpers;

import com.testautomationlibrary.cucumber.api.rest.models.Pet;
import com.testautomationlibrary.cucumber.api.rest.testdata.ValidData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PetOperationHelpers {

    public static Response createPetWithFullResponse(Pet pet)
    {
        Response response = null;
        try {
            //Making the rest post request to create the pet using RestAssured
            RestAssured.baseURI = ValidData.BASE_URI;

            response = given().
                    body(pet).contentType(ContentType.JSON).log().all().
                    when().
                    post().
                    then().
                    extract().response();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  response;
    }
}
