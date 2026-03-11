package org.bank.steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bank.pages.MainPage;

public class StepsDef {

    MainPage mainPage = new MainPage();

    @Given("Открыта главная страница")
    public void openPage() {
        mainPage.openMainPage();
    }

    @And("Открываю страницу clickButton")
    public void openClickButton() {
        mainPage.openClickButton();
    }

    @Then("Проверяю что кнопка BadButton отображается")
    public void checkBadButtonAppears() {
        mainPage.checkBadButtonAppears();
    }
}
