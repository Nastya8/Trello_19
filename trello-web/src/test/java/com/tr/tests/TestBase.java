package com.tr.tests;

import com.tr.manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() {
        app.start();

    }

    @AfterClass

    public void tearDown(){
        //close browser
        app.stop();
    }

}
