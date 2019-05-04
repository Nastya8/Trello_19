package com.tr.tests;

import org.testng.annotations.Test;

public class CreateBoard extends TestBase{

    @Test
    public void boardCreationTest() throws InterruptedException {

        app.clickOnPlusButtonOnHeader();
        app.selectCreateBoardFromDropDown();
        app.fillBoardCreationForm("Test board1");
        app.submitBoardCreation();
    }

    @Test(enabled = false)
    public void boardCreationNegativeTest(){

    }
}
