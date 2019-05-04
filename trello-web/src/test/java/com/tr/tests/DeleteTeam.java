package com.tr.tests;

import org.testng.annotations.Test;

public class DeleteTeam extends TestBase {
    @Test
    public void teamDeleteTest (){

        app.clickOnPlusButtonOnSettings();
        app.clickOnTextDeleteThisTeam();
        app.clickOnButtonDeleteForever();
    }
}
