package com.tr.tests;

import org.testng.annotations.Test;

public class DeleteBoard extends TestBase{
    @Test
    public void boardDeleteTest() throws InterruptedException {
        app.clickOnFirstBoard();
        app.clickOnButtonShowMenu();
        app.clickOnButtonMore();
        app.clickOnButtonCloseBoard();
        app.submitCloseBoard();
    }
}
