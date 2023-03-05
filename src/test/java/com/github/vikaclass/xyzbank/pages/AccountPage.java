package com.github.vikaclass.xyzbank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends ParentPage {


    private By depositButton = By.xpath("//*[contains(text(), 'Deposit')]");
    private By withdrawalButton = By.xpath("//*[contains(text(), 'Withdrawl')]");

    private By amountInput = By.xpath("//input[@type=\"number\"]");

    private By submitButtonSelector = By.xpath("//button[@type=\"submit\"]");

    private By balance = By.xpath("//*[contains(text(), 'Account Number : ')]/strong[2]");

    private By successMessageSelector = By.xpath("//*[@class='error ng-binding']");

    private By withdrawlAmountInput = By.xpath(("//label[contains(text(), 'Amount to be Withdrawn :')]/following::input"));

    public AccountPage(WebDriver webDriver) {
        super(webDriver);
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
        WebElement depositSubmit = driver.findElement(submitButtonSelector);
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
        String text = successMessage.getText();
        boolean result = text.equalsIgnoreCase(message);
        return result;
    }

    public void clickWithdrawalTab() {
        WebElement withdrawalTab = driver.findElement(withdrawalButton);
        withdrawalTab.click();
    }

    public void clickWithdrawal() {
        WebElement withdrawlSubmit = driver.findElement(submitButtonSelector);
        withdrawlSubmit.click();
    }

    public void fillWithdrawlAmount(int withdrawlAmount) {
        WebElement amountWithdrawlElement = driver.findElement(withdrawlAmountInput);
        amountWithdrawlElement.sendKeys("" + withdrawlAmount);
    }
}
