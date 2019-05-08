package com.tr.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTeam extends TestBase {

    @Test
    public void teamCreationTest()throws InterruptedException{

        app.getHeader().clickOnPlusButtonOnHeader();
        app.getTeamHelper().selectCreateTeamFromDropDown();
        app.getTeamHelper().fillTeamCreationForm("Test team1", "desc");
        app.getTeamHelper().submitTeamCreation();

        String teamName = app.getTeamName();
        Assert.assertEquals(teamName,"Test team1");

    }
}
