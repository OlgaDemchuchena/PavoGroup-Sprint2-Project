package com.pavo_project.step_definitions;

import com.pavo_project.pages.LoginPage;
import com.pavo_project.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if(userType.contains("pos")){
            username = ConfigurationReader.getProperty("pos_manager_username");
            password = ConfigurationReader.getProperty("pos_manager_password");
        }else if(userType.contains("sales")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

   }
