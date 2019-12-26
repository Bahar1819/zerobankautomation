package com.zerobank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForeignCurrencyStepDefinitions {
    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {

    }

//    Scenario: Available currencies
//    Given the user accesses the Purchase foreign currency cash tab
//    Then following currencies should be available
//      |Australia (dollar) |
//            |Canada (dollar)    |
//            |Switzerland (franc)|
//            |China (yuan)       |
//            |Denmark(krone)     |
//            |Eurozone(euro)     |
//            |Great Britain(pound)|
//            |Japan(yen)          |
//            |Mexico(peso)        |
//            |Norway(krone)       |
//            |New Zealand (dollar)|
//            |Singapore (dollar)  |


    @Then("following currencies should be available")
    public void following_currencies_should_be_available(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("user tries to calculate cost without selecting currency")
    public void user_tries_to_calculate_cost_without_selecting_currency() {

    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

    }


    @When("user tries to calculate cost without entering value")
    public void user_tries_to_calculate_cost_without_entering_value() {

    }


}
