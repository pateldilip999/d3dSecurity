package com.StepDefinations;

import com.driverClass;
import org.junit.After;
import org.junit.Before;

public class hooks {

    driverClass dclass=new driverClass();

    @Before
    public void open(){

        dclass.openBrowser();
    }

    @After
    public void close(){

        dclass.closeBrowser();

    }
}
