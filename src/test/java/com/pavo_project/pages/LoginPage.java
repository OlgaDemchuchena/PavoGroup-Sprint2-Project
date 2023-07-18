package com.pavo_project.pages;


import com.pavo_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement userName;



    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
