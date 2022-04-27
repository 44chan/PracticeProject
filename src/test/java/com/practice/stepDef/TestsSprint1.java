package com.practice.stepDef;

import com.practice.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestsSprint1 {

    MainPage mainPage = new MainPage();


    //US1
    @Given("User can input amount {string}")
    public void user_can_input_amount(String string) {

        mainPage.operateWithCurrenciesMethod(string);

    }

    @When("User can select from and to currencies")
    public void user_can_select_from_and_to_currencies() {

        //As i mentioned in MainPage class i created only one method which implements all steps from 1st to 3rd to save time - in those two empty there would be to another methods
        // I am mostly using methods to save memory and less hard coding thanks to POM - Page Object Model

    }

    @Then("User have the ability to change the from and to currencies after selection")
    public void user_have_the_ability_to_change_the_from_and_to_currencies_after_selection() {

        //As i mentioned in MainPage class i created only one method which implements all steps from 1st to 3rd to save time - in those two empty there would be to another methods
        // I am mostly using methods to save memory and less hard coding thanks to POM - Page Object Model

    }


    //US2
    @Given("User view the from and to currency codes")
    public void user_view_the_from_and_to_currency_codes() {

        System.out.println(mainPage.fromCurCodes.getText());
        System.out.println(mainPage.toCurCodes.getText());

    }
    @Given("User can view the from and to currency names")
    public void user_can_view_the_from_and_to_currency_names() {
        System.out.println(mainPage.fromCurNames.getText());
        System.out.println(mainPage.toCurNames.getText());
    }
    @Given("User can view the currency conversion computation for both the currencies")
    public void user_can_view_the_currency_conversion_computation_for_both_the_currencies() {

        System.out.println(mainPage.resultFromBothComputation.getText());

    }
    @Given("User can view current date and time of conversion")
    public void user_can_view_current_date_and_time_of_conversion() {
        System.out.println(mainPage.resultFromBothDateAndTime.getText());
    }
    @Then("User have a provision to look at a chart that shows the rate history for the given day {string}")
    public void user_have_a_provision_to_look_at_a_chart_that_shows_the_rate_history_for_the_given_day(String string) {
        mainPage.chartForRateHistoryToGivenDay(string);
    }


}
