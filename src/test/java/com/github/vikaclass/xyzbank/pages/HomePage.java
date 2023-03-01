package com.github.vikaclass.xyzbank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver webDriver;

    private By customerLogin = By.xpath("//*[contains(text(), 'Customer Login')]");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickCustomerLogin() {
        WebElement customerLoginElement = webDriver.findElement(customerLogin);
        customerLoginElement.click();

    }
}
