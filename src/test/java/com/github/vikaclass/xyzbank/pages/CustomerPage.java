package com.github.vikaclass.xyzbank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage extends ParentPage {

    private By userSelect = By.id("userSelect");
    private By loginButton = By.xpath("//*[contains(text(), 'Login')]");

    public CustomerPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void makeLogin(String arg0) {
        Select select = new Select(driver.findElement(userSelect));
        select.selectByVisibleText(arg0);
        WebElement webLogin = driver.findElement(loginButton);
        webLogin.click();


    }
}
