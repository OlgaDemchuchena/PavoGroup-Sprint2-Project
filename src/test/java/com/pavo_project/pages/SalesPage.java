package com.pavo_project.pages;

import com.pavo_project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage {


    public SalesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[6]/a/span")
    public WebElement salesButton;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr")
    public WebElement ToGetColumns;

    @FindBy(xpath = "//input[@class='o_searchview_input']")  //(xpath = "//body[@class='o_web_client']" "//input[@class='o_searchview_input']")
    public WebElement searchButton;

    @FindBy(xpath = "//td[@class='o_data_cell o_readonly_modifier o_required_modifier']")
    public WebElement actualResult;


}