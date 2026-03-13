package org.bank.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    SelenideElement clickButton = $(By.xpath("//a[@href='/click']"));
    SelenideElement badButton = $(By.xpath("//button[@id='badButton']"));

    public void openMainPage() {
        Selenide.open("/", MainPage.class);
    }

    public void openClickButton() {
        clickButton.click();
    }

    public void checkBadButtonAppears() {
        badButton.should(Condition.visible);
    }

    public void checkBadButtonNotAppears() {
        badButton.shouldNot(Condition.visible);
    }

}
