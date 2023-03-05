package com.github.vikaclass.xyzbank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends ParentPage {

    private By customerLogin = By.xpath("//*[contains(text(), 'Customer Login')]");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickCustomerLogin() {
        WebElement customerLoginElement = driver.findElement(customerLogin);
        customerLoginElement.click();

    }
}
