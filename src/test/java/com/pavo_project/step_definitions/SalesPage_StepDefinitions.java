package com.pavo_project.step_definitions;

import com.pavo_project.pages.LoginPage;
import com.pavo_project.pages.SalesPage;
import com.pavo_project.utilities.BrowserUtils;
import com.pavo_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SalesPage_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("User logged in with {string}, {string}")
    public void user_logged_in_with(String username, String password) {
        loginPage.login(username, password);
    }

   SalesPage salesPage = new SalesPage();
    @When("User is in the Sales page")
    public void user_is_in_the_sales_page() {

        BrowserUtils.sleep(5);
        salesPage.salesButton.click();
    }
    @Then("User indicates {int} columns to see the quotations’ descriptions")
    public void user_indicates_columns_to_see_the_quotations_descriptions(int int1) {


     List<WebElement> TotalColsList = salesPage.ToGetColumns.findElements(By.xpath("//th[@class='o_column_sortable']"));
     Assert.assertEquals(TotalColsList.size(), 6);

    }

    @When("User enters Quotation Number data “SO801” in a Search window and clicks Enter")
    public void user_enters_quotation_number_data_so801_in_a_search_window() {

        salesPage.searchButton.sendKeys("SO801" + Keys.ENTER);
    }
    @Then("User sees the result on the list")
    public void user_sees_the_result_on_the_list() {

      String expectedResult = "SO801";

      Assert.assertEquals(salesPage.actualResult.getText(), expectedResult);

    }
}
