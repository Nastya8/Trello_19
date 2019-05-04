package com.tr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
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

    @AfterClass

    public void tearDown(){
        //close browser
        wd.quit();
    }
}
