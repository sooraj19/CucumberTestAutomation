package com.testautomationlibrary.cucumber.api.rest.models;

public class Tag {

    public int id;
    public String name;

    public Tag setTag(int tagId, String tagName)
    {
        this.id = tagId;
        this.name = tagName;
        return this;
    }
}
