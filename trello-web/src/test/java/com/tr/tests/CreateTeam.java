package com.tr.tests;

import org.testng.annotations.Test;

public class CreateTeam extends TestBase {

    @Test
    public void teamCreationTest()throws InterruptedException{

        app.clickOnPlusButtonOnHeader();
        app.selectCreateTeamFromDropDown();
        app.fillTeamCreationForm("Test team1");
        app.submitTeamCreation();

    }
}
