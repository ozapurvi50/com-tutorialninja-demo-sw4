package com.tutorialninja.sw4.pages;

import com.tutorialninja.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class GuestCheckOutPage extends Utility {

    By name = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By phone = By.xpath("//input[@id='input-payment-telephone']");
    By address = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By payzone = By.xpath("//select[@id='input-payment-zone']");
    By continueButtons = By.xpath("//input[@value='guest']");
    By guestContinue = By.cssSelector("#button-account");
    By continueRegisterButton = By.cssSelector("#button-guest");;

    public void clickOnContinueButton() {
        clickOnElement(continueButtons);
    }

    public void sendName(String text) {
        sendTextToElement(name, text);
    }

    public void sendLastName(String text) {
        sendTextToElement(lastName, text);
    }

    public void sendAddress(String text) {
        sendTextToElement(address, text);
    }

    public void sendEmail(String text) {
        sendTextToElement(email, text);
    }

    public void sendTelephone(String text) {
        sendTextToElement(phone, text);
    }

    public void sendCity(String text) {
        sendTextToElement(city, text);
    }

    public void sendPostCode(String text) {
        sendTextToElement(postcode, text);
    }

    public void enterRegion(String text) {
        selectByVisibleTextFromDropDown(payzone, text);
    }


    public void continueRegister() {
        clickOnElement(continueRegisterButton);
    }

    public void clickContinue(){

        clickOnElement(guestContinue);
    }
}
