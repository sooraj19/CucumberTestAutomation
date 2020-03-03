package com.testautomationlibrary.cucumber.api.rest.testdata;

import com.testautomationlibrary.cucumber.api.rest.models.Category;
import com.testautomationlibrary.cucumber.api.rest.models.Pet;
import com.testautomationlibrary.cucumber.api.rest.models.Tag;

public class ValidData {

    private static final String[] PHOTO_URLS = new String[] {"home/tommy1.jpg", "home/tommy2.jpg"};

    public static final String BASE_URI = "https://petstore.swagger.io/v2/pet";

    public static Pet getFirstPet()
    {
        return new Pet().createPet(1514, getFirstPetCategory(), "Tommy", PHOTO_URLS, getFirstPetTags(), "available");
    }

    private static Tag[] getFirstPetTags()
    {
        Tag firstTag = new Tag().setTag(2, "Brown");
        Tag secondTag = new Tag().setTag(3, "Hound");
        return new Tag[] {firstTag, secondTag};
    }

    private static Category getFirstPetCategory()
    {
        return new Category().setCategory(123, "Friendly");
    }

}
