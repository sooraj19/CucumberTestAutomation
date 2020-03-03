package com.testautomationlibrary.cucumber.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {

    WebDriver driver;

    By ageSelectionCheckBox = By.id("isAgeSelected");
    By messageLabel = By.id("txtAge");

    public CheckboxPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goTo()
    {
        this.driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    public void toggleAgeCheckboxSelection()
    {
        this.driver.findElement(ageSelectionCheckBox).click();
    }

    public String getOutputMessage()
    {
        return this.driver.findElement(messageLabel).getAttribute("innerHTML");
    }
}
