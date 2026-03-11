package org.bank.hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;


public class Hooks {

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVnc", true);
        }});
        Configuration.browserCapabilities = options;

    }

}
