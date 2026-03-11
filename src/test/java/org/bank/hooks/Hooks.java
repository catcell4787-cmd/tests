package org.bank.hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;


public class Hooks {

    @Before
    public void setup() {
        Configuration.baseUrl = "https://www.uitestingplayground.com";
        Configuration.remote = "http://192.168.50.210:4443/wd/hub";
        ChromeOptions options = new ChromeOptions();
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVnc", true);
        }});
        Configuration.browserCapabilities = options;

    }

}
