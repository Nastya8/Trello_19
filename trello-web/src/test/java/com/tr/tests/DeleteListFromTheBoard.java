package com.tr.tests;

import org.testng.annotations.Test;

public class DeleteListFromTheBoard extends TestBase {

    @Test
    public void listDeleteTest(){
        app.clickOnFirstBoard();
        app.clickOnButtonThreePoints();
        app.clickOnTextArchiveThisList();
    }
}
