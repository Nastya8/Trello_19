package com.tr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        openSite("https://trello.com/");
        login("korsarushka@yandex.ru", "vasabi2018");
    }

    public void submitBoardCreation() {
        click(By.cssSelector("[type=submit]"));
    }

    public void fillBoardCreationForm(String boardName) {
        type(By.xpath("//*[@class='subtle-input']"), boardName);
    }

    public void selectCreateBoardFromDropDown() {
        click(By.cssSelector("[class='js-new-board']"));
    }

    public void clickOnPlusButtonOnHeader() throws InterruptedException {
        Thread.sleep(10000);
        click(By.cssSelector("[class='header-btn-icon icon-lg icon-add light']"));

    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void login(String username, String password) {
        click(By.cssSelector("[href='/login']"));
        type(By.name("user"), username);
        type(By.name("password"), password);
        click(By.id("login"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void stop() {
        wd.quit();
    }

    public void selectCreateTeamFromDropDown() {
        click(By.cssSelector("[class='js-new-org']"));
    }

    public void fillTeamCreationForm(String teamName) {
        type(By.id("org-display-name"), teamName);
    }

    public void submitTeamCreation() {
        click(By.cssSelector("[type=submit]"));
    }

    public void clickOnPlusButtonOnSettings() {
        click(By.cssSelector("[class='icon-sm icon-gear boards-page-board-section-header-options-item-icon']"));
    }

    public void clickOnTextDeleteThisTeam() {
        click(By.xpath("//span[contains(text(),'Delete this team?')]"));
    }

    public void clickOnButtonDeleteForever() {
        click(By.cssSelector("[class='js-confirm full negate']"));
    }

    public void clickOnFirstBoard() {
        click(By.cssSelector("[class='board-tile-details is-badged']"));
    }

    public void clickOnAddAListButton() {
        click(By.cssSelector("[class='icon-sm icon-add']"));
    }

    public void typeListName() {
        type(By.name("name"), "New list");
    }

    public void submitAddList () throws InterruptedException {
        click(By.cssSelector("[class='primary mod-list-add-button js-save-edit']"));
        Thread.sleep(10000);
    }

    public void clickOnButtonThreePoints() {
        click(By.cssSelector("[class='list-header-extras-menu dark-hover js-open-list-menu icon-lg icon-overflow-menu-horizontal']"));
    }

    public void clickOnTextArchiveThisList() {
        click(By.xpath("//*[contains(text(),'Archive This List')]"));
    }
}
