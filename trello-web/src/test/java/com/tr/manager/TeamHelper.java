package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class TeamHelper {
    WebDriver wd;
    public TeamHelper(WebDriver wd) {

        this.wd = wd;
    }

    public void selectCreateTeamFromDropDown() {
        click(By.cssSelector("[class='js-new-org']"));
    }

    public void fillTeamCreationForm(String teamName, String desc) {
        type(By.id("org-display-name"), teamName);
        type(By.name("desc"), desc);
    }

    public void submitTeamCreation() {
        click(By.cssSelector("[type=submit]"));
    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
