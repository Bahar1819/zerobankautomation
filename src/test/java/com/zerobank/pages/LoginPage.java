package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="user_login")
    public WebElement UsernameInput;

    @FindBy(id="user_password")
    public WebElement passwordInput;

    @FindBy(name = "submit")
    public WebElement SignInBtn;

    @FindBy(className = "alert alert-error")
    public WebElement errorMessage;

    public void login(String username, String password){
        UsernameInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }







}
