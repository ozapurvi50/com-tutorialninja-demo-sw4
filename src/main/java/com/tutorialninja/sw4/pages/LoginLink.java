package com.tutorialninja.sw4.pages;

import com.tutorialninja.sw4.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginLink extends Utility {

    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By login = By.xpath("//a[normalize-space()='Login']");
    By logout = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
    By accountList = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By submit = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");
    By message = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    By message1 = By.xpath("//h2[normalize-space()='Returning Customer']");  //verify returning customer text


    public void clickOnMyAccount() {
        clickOnElement(myAccount);
    }
    public void selectMenu1(String text) {
        selectMyAccountOptions(login, text);
    }
    public void logOut(String text) {
        selectMyAccountOptions(logout, text);
    }
    public void enterEmail(String text) {
        sendTextToElement(email, text);
    }
    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }
    public void submitButton() {
        clickOnElement(submit);
        clickOnElement(myAccount);
    }
    public String getMessage() {

        return getTextFromElement(message);   // method to verify Logout
    }
    public String getMessage1() {

        return getTextFromElement(message1);   // method to verify Logout
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);        //Continue button after log out to go on main page
    }
}

