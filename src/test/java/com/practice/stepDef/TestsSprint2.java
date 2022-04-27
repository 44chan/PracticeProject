package com.practice.stepDef;

import com.practice.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestsSprint2 {

    MainPage mainPage = new MainPage();

    @Given("User can see the from and to currency codes")
    public void user_can_see_the_from_and_to_currency_codes() {

        System.out.println(mainPage.fromCurBtn.getText());
        System.out.println(mainPage.toCurBtn.getText());

    }
    @When("User can use a default amount and perform a conversion")
    public void user_can_use_a_default_amount_and_perform_a_conversion() {

        mainPage.defaultAmountConversion();

    }
    @Then("User can change the default amount before conversion {string}")
    public void user_can_change_the_default_amount_before_conversion(String string) {

        mainPage.changedAmountConversion(string);

    }

}
