package com.StudentManagement.step_definitions;

import com.StudentManagement.pages.BasePage;
import com.StudentManagement.utilies.BrowserUtilies;
import com.StudentManagement.utilies.Driver;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


    public class MeetingStepDefinitions {

        private WebDriver driver;

        @Given("User enters the home page")
        public void user_enters_home_page() {
            Driver.getDriver().get("https://managementonschools.com/");
            BrowserUtilies.waitFor(5);
        }

        @And("User clicks on the menu")
        public void user_clicks_menu() {
            {
                BasePage.Menu.click();
            }
        }

        @And("Meet Management is clicked")
        public void meet_management_clicked() {
            BasePage.MeetManagement.click();
        }

        @Then("Meet Management page appears and Date, Start Time, End Time, and Description of meetings are visible to the teacher")
        public void meet_management_page_appears() {
            BasePage.MeetList.click();
        }
    }
