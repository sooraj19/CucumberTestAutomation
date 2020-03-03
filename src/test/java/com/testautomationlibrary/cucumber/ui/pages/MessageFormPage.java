package com.testautomationlibrary.cucumber.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessageFormPage {

    WebDriver driver;

    By messageTextBox = By.id("user-message");
    By formSubmitButtom = By.xpath("//button[.='Show Message']");
    By outputLabel = By.id("display");

    public MessageFormPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goTo()
    {
        this.driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    public void submitMessage(String message)
    {
        this.driver.findElement(messageTextBox).sendKeys(message);
        this.driver.findElement(formSubmitButtom).click();
    }

    public String getOutputMessage()
    {
        return this.driver.findElement(outputLabel).getAttribute("innerHTML");
    }
}
