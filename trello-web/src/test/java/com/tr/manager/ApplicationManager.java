package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    TeamHelper teamHelper;
    BoardHelper boardHelper;
    HeaderHelper header;
    WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        openSite("https://trello.com/");
        login("korsarushka@yandex.ru", "vasabi2018");
        boardHelper = new BoardHelper(wd);
        teamHelper = new TeamHelper(wd);
        header = new HeaderHelper(wd);
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

    public String getTeamName() {
        return wd.findElement(By.cssSelector("h1.u-inline")).getText();
    }

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }

    public TeamHelper getTeamHelper() {
        return teamHelper;

    }

    public HeaderHelper getHeader() {
        return header;
    }

    public void clickOnButtonShowMenu() {
        click(By.cssSelector("[class='board-header-btn mod-show-menu js-show-sidebar']"));
    }

    public void clickOnButtonMore() {
        click(By.cssSelector("[class='board-menu-navigation-item-link js-open-more']"));
    }

    public void clickOnButtonCloseBoard() {
        click(By.cssSelector("[class='board-menu-navigation-item-link js-close-board']"));
    }

    public void submitCloseBoard() throws InterruptedException {
        click(By.cssSelector("[class='js-confirm full negate']"));
        Thread.sleep(10000);
    }
}
