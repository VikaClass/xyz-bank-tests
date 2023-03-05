package com.github.vikaclass.xyzbank.pages;

import org.openqa.selenium.WebDriver;

public abstract class ParentPage {
    protected final WebDriver driver;

    public ParentPage(WebDriver webDriver) {
        this.driver = webDriver;
    }
}
