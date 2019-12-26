package com.zerobank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddNewPayeeStepDefinitions {
    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {

    }

//    Given Add New Payee tab
//    And creates new payee using following information
//    |Payee Name    | The Law Offices of Hyde, Price & Scharks|
//            |Payee Address | 100 Same st, Anytown,, USA, 10001       |
//            |Account       | Checking                                |
//            |Payee details| XYZ account                              |


    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {

    }


}
