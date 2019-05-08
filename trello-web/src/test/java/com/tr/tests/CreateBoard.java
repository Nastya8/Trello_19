package com.tr.tests;

import org.testng.annotations.Test;

public class CreateBoard extends TestBase{

    @Test
    public void boardCreationTest() throws InterruptedException {

        app.getHeader().clickOnPlusButtonOnHeader();
        app.getBoardHelper().selectCreateBoardFromDropDown();
        app.getBoardHelper().fillBoardCreationForm("Test board1");
        app.getBoardHelper().submitBoardCreation();
    }

    @Test(enabled = false)
    public void boardCreationNegativeTest(){

    }
}
