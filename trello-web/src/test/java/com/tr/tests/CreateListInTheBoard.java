package com.tr.tests;

import org.testng.annotations.Test;

public class CreateListInTheBoard extends TestBase{

    @Test
    public void AddListToFirstBoard() throws InterruptedException{

        app.clickOnFirstBoard();
        app.clickOnAddAListButton();
        app.typeListName();
        app.submitAddList();
    }
}
