package com.testautomationlibrary.cucumber.api.rest.helpers;

import com.testautomationlibrary.cucumber.api.rest.models.Pet;
import org.junit.Assert;

public class AssertionHelpers {

    public static void assertPetsAreEqual (Pet expectedPet, Pet actualPet)
    {
        Assert.assertEquals("pet.id should be same", expectedPet.id, actualPet.id);
        Assert.assertEquals("pet.category.id should be same", expectedPet.category.id, actualPet.category.id );
        Assert.assertEquals("pet.category.name should be same", expectedPet.category.name, actualPet.category.name);
        Assert.assertEquals("pet.name should be same", expectedPet.name, actualPet.name);

        Assert.assertEquals("Number of photoUrls should be same", expectedPet.photoUrls.length, actualPet.photoUrls.length);
        for (int i = 0; i < expectedPet.photoUrls.length; i ++)
        {
            Assert.assertEquals("photo urls should match at index " + i, expectedPet.photoUrls[i], actualPet.photoUrls[i]);
        }

        Assert.assertEquals("Number of pet tags should be same", expectedPet.tags.length, actualPet.tags.length);
        for (int i = 0; i < expectedPet.tags.length; i ++)
        {
            Assert.assertEquals("tag.id should match at index " + i, expectedPet.tags[i].id, actualPet.tags[i].id);
            Assert.assertEquals("tag.name should match at index " + i, expectedPet.tags[i].name, actualPet.tags[i].name);
        }

        Assert.assertEquals("pet.status should be same", expectedPet.status, actualPet.status);
    }

}
