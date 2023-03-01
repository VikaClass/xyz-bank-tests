package com.github.vikaclass.xyzbank.steps;

import com.github.vikaclass.xyzbank.pages.CustomerPage;
import com.github.vikaclass.xyzbank.pages.HomePage;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    static { //TODO перенести в правильное место
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver110\\chromedriver.exe");
    }
    WebDriver driver = new ChromeDriver();
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

    }


    @Тогда("^баланс остался нулевым$")
    public void balanceIsZero() {
    }

}
