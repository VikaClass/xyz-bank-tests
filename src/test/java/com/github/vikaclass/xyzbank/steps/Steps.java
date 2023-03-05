package com.github.vikaclass.xyzbank.steps;

import com.github.vikaclass.xyzbank.pages.AccountPage;
import com.github.vikaclass.xyzbank.pages.CustomerPage;
import com.github.vikaclass.xyzbank.pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver driver;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver110\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void after(){
        driver.close();
    }

    @Дано("^пользователь зашел на сайт$")
    public void userGoesToSite() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @И("^залогинился$")
    public void userLogins() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCustomerLogin();
    }

    @И("^выбрал имя \"([^\"]*)\" и нажал кнопку логин$")
    public void maidLogin(String arg0) throws Throwable {
        CustomerPage customerPage = new CustomerPage(driver);
        customerPage.makeLogin(arg0);

    }

    @Когда("^пользователь выбрал Deposit$")
    public void userSelectedDeposit() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickDepositTab();
    }

    @И("^ввел сумму (\\d+)$")
    public void fillAmount(int arg0) {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.fillAmount(arg0);
    }

    @И("^нажал кнопку Deposit$")
    public void clickDepositButton() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickDeposit();
    }

    @Тогда("^на балансе (\\d+) денег$")
    public void balanceIncreased(int expected) {
        AccountPage accountPage = new AccountPage(driver);
        int balance = accountPage.getBalance();
        Assert.assertEquals(expected,balance);
    }

    @И("^отобразилось сообщение \"([^\"]*)\"$")
    public void showMessage(String arg0) throws Throwable {
        AccountPage accountPage = new AccountPage(driver);
        boolean exits = accountPage.existSuccessMessage(arg0);
        Assert.assertTrue(exits);

    }


    @Тогда("^баланс остался нулевым$")
    public void balanceIsZero() {
        AccountPage accountPage = new AccountPage(driver);
        int balance = accountPage.getBalance();
        Assert.assertEquals(0, balance);

    }

}
