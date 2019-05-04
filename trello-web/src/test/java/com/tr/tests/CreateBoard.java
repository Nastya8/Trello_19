package com.tr.tests;

import org.testng.annotations.Test;

public class CreateBoard extends TestBase{

    @Test
    public void boardCreationTest() throws InterruptedException {

        clickOnPlusButtonOnHeader();
        selectCreateBoardFromDropDown();
        fillBoardCreationForm("Test board1");
        submitBoardCreation();
    }

    @Test(enabled = false)
    public void boardCreationNegativeTest(){

    }
}
