package com.testautomationlibrary.cucumber.ui.stepdefinitions;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class StepDefinition {

    public WebDriver driver;

    public StepDefinition()
    {
        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDrivers\\chromedriver\\chromedriver-v80.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }
}
