package com.github.vikaclass.xyzbank.steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    static { //TODO перенести в правильное место
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver110\\chromedriver.exe");
    }
    WebDriver driver = new ChromeDriver();
    @Дано("^пользователь зашел на сайт$")
    public void userGoesToSite() {
    }

    @И("^залогинился$")
    public void userLogins() {
    }

    @И("^выбрал имя \"([^\"]*)\" и нажал кнопку логин$")
    public void maidLogin(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Когда("^пользователь выбрал Deposit$")
    public void userSelectedDeposit() {
    }

    @И("^ввел сумму (\\d+)$")
    public void fillAmount(int arg0) {
    }

    @И("^нажал кнопку Deposit$")
    public void clickDepositButton() {
    }

    @Тогда("^произведено пополнение баланса на (\\d+)$")
    public void balanceIncreased(int arg0) {
    }

    @И("^отобразилось сообщение \"([^\"]*)\"$")
    public void showMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Тогда("^баланс остался нулевым$")
    public void balanceIsZero() {
    }

}
