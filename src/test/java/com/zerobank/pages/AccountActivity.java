package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity {

    @FindBy(css="a[href='#ui-tabs-1']")
    public WebElement showTransactionsSubTab;

    @FindBy(css="a[href='#ui-tabs-2']")
    public WebElement findTransactionsSubTab;

    @FindBy(css = "[id='aa_accountId']>option")
    public List<WebElement> accountDropDownOptions;

    @FindBy(id = "aa_accountId")
    public WebElement accountDropDown;

    @FindBy(css = "[id='all_transactions_for_account'] th")
    public List<WebElement> transactionTableColumnNames;

    @FindBy (id = "aa_description")
    public WebElement description;

    @FindBy (id = "aa_fromDate")
    public WebElement dateFrom;

    @FindBy (id = "aa_toDate")
    public WebElement dateTo;

    @FindBy (id = "aa_fromAmount")
    public WebElement amountFrom;

    @FindBy (id = "aa_toAmount")
    public WebElement amountTo;

    @FindBy (id = "aa_type")
    public WebElement type;

    @FindBy (css = "button[class='btn btn-primary']")
    public WebElement findBtn;

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(1)")
    public List<WebElement> datesFromTable; //find transactions result table

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(2)")
    public List<WebElement> descriptionsFromTable;

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(3)")
    public List<WebElement> depositsFromTable;

    @FindBy(css = "[id='filtered_transactions_for_account'] tbody tr td:nth-of-type(4)")
    public List<WebElement> withdrawalsFromTable;


    public boolean isSelected (String accountType){
        Select select= new Select(accountDropDown);
        return select.getFirstSelectedOption().getText().equals(accountType);
    }
}
