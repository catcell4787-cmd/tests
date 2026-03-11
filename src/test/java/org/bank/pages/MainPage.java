package org.bank.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;



public class MainPage {

    SelenideElement clickButton = $(By.xpath("//a[@href='/click']"));
    SelenideElement badButton = $(By.xpath("//button[@id='badButton']"));

    public void openClickButton() {
        clickButton.click();
    }

    public void checkBadButtonAppears() {
        badButton.should(Condition.visible);
    }

}
