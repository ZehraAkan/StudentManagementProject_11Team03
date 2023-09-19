package com.StudentManagement.pages;

import com.StudentManagement.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void Userclicksonthemenu(){};
    //*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']
    @FindBy(xpath = "(//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public static WebElement Menu;

    public void MeetManagementisclicked(){};
    //a[@class='nav-link'])[7]
    @FindBy(xpath ="(//a[@class='nav-link'])[7]")
    public static WebElement MeetManagement;

    public void DateStartTimeEndTimeandDescription(){};
    @FindBy(xpath = " //*[@class='container-fluid'][3]")
    public static WebElement MeetList;

}


