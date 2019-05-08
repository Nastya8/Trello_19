package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper {
    WebDriver wd;
    public HeaderHelper(WebDriver wd) {

        this.wd = wd;
    }
    public void clickOnPlusButtonOnHeader() throws InterruptedException {
        Thread.sleep(10000);
        click(By.cssSelector("[class='header-btn-icon icon-lg icon-add light']"));

    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }

}
