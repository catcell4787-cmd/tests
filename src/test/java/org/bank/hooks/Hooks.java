package org.bank.hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void setup() {
        Configuration.browser = "chrome";
    }

}
