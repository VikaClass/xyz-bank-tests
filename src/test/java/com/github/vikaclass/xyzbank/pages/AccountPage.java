package com.github.vikaclass.xyzbank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
    private final WebDriver driver;

    private By depositButton = By.xpath("//*[contains(text(), 'Deposit')]");

    private By amountInput = By.xpath("//input[@type=\"number\"]");

    private By depositSubmitSelector = By.xpath("//button[@type=\"submit\"]");

    private By balance = By.xpath("//*[contains(text(), 'Account Number : ')]/strong[2]");

    private By successMessageSelector = By.xpath("//*[@class='error ng-binding']");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDepositTab() {
        WebElement depositElement = driver.findElement(depositButton);
        depositElement.click();
    }

    public void fillAmount(int amount) {
        WebElement amountDepositElement = driver.findElement(amountInput);
        amountDepositElement.sendKeys("" + amount);
    }

    public void clickDeposit() {
        WebElement depositSubmit = driver.findElement(depositSubmitSelector);
        depositSubmit.click();
    }

    public int getBalance() {
        WebElement actualBalance = driver.findElement(balance);
        String textBalance = actualBalance.getText();
        int result = Integer.parseInt(textBalance);
        return result;
    }

    public boolean existSuccessMessage(String message) {
        WebElement successMessage = driver.findElement(successMessageSelector);
        boolean result = successMessage.getText().equalsIgnoreCase(message);
        return result;
    }
}
