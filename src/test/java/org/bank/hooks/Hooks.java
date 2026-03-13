package org.bank.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;


public class Hooks {

    @Before
    public void setup() {
        Configuration.remote = "http://192.168.50.210:4443/wd/hub";
        ChromeOptions options = new ChromeOptions();
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVnc", true);
        }});
        Configuration.browserCapabilities = options;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
    }

}
