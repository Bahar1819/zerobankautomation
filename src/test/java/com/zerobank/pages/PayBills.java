package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayBills {

    @FindBy(id = "sp_payee")
    public WebElement payeeOption;

    @FindBy(id = "sp_account")
    public WebElement accountOption;

    @FindBy(id = "sp_amount")
    public WebElement amountOption;

    @FindBy(id = "sp_date")
    public WebElement dateOption;

    @FindBy(id = "sp_description")
    public WebElement descriptionOption;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;

    @FindBy(id = "alert_container")
    public WebElement verificationMessage;

    @FindBy(css = "[href='#ui-tabs-2']")
    public WebElement addNewPayeeSubTab;

    @FindBy(id = "np_new_payee_name")
    public WebElement newPayeeNameOption;

    @FindBy(id = "np_new_payee_address")
    public WebElement newPayeeAdressOption;

    @FindBy(id = "np_new_payee_account")
    public WebElement newPayeeAccountOption;

    @FindBy(id = "np_new_payee_details")
    public WebElement newPayeeDetailsOption;

    @FindBy(id = "add_new_payee")
    public WebElement newPayAddButton;

    @FindBy(css = "href='#ui-tabs-3'")
    public WebElement purchaseForeignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropDown;

    @FindBy(id = "pc_amount")
    public WebElement purchaseAmountInputBox;

    @FindBy(css = "[type='radio']")
    public List<WebElement> radioSelect;

    @FindBy(id="pc_calculate_costs")
    public WebElement calculateCostBtn;

    @FindBy(id="purchase_cash")
    public WebElement purchaseButton;

    public void createPayee(String name,String account, String adress, String details){
        BrowserUtils.waitForPageToLoad(5);
        newPayeeNameOption.sendKeys(name);
        newPayeeAdressOption.sendKeys(adress);
        newPayeeAccountOption.sendKeys(account);
        newPayeeDetailsOption.sendKeys(details, Keys.ENTER);
    }

    public void setPayeeOptions(String payeeName){
        Select select= new Select(payeeOption);
        select.selectByVisibleText(payeeName);

    }

    public void setAccountOptions(String accountName){
        Select select= new Select(accountOption);
        select.selectByVisibleText(accountName);

    }





}
