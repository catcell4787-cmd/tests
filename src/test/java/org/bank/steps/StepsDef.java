package org.bank.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bank.pages.MainPage;

import static java.lang.Thread.sleep;

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
    public void checkBadButtonAppears() throws InterruptedException {
        mainPage.checkBadButtonAppears();
//        sleep(5000);
    }

    @Then("Проверяю что кнопка BadButton не отображается")
    public void checkBadButtonNotAppears() {
        mainPage.checkBadButtonNotAppears();
    }
}
