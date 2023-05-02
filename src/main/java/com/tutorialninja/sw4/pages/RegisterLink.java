package com.tutorialninja.sw4.pages;

import com.tutorialninja.sw4.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterLink extends Utility {

    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By accountList = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By path = By.xpath("//h1[contains(text(),'Register Account')]");
    By name = By.id("input-firstname");
    By lastname = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By radioButton = By.xpath("//fieldset[3]//input");
    By checkBox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton =  By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By path1 = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continue1= By.xpath("//a[contains(text(),'Continue')]");
    By path2 = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continue2 = By.xpath("//a[contains(text(),'Continue')]");
    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(accountList);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(accountList);
        }
    }
    public void clickOnMyaccount() {
        clickOnElement(myAccount);                      //Clicking on Myaccount link

    }
    public String getMessage() {
        return getTextFromElement(path);                 //Getting message from webpage to verify
    }
    public void sendName(String details){
        sendTextToElement(name ,details);                //Entering details to name field
    }
    public void sendLastName(String details){
        sendTextToElement(lastname,details);           //Entering details to lastname field
    }
    public void sendEmail(String details){
        sendTextToElement(email,details);               //Entering details to email field
    }
    public void sendTelephone(String details){
        sendTextToElement(telephone,details);            //Entering details to telephone field
    }
    public void sendPassword(String details){
        sendTextToElement(password,details);             //Entering details to password field
    }
    public void sendConfirmPassword(String details){
        sendTextToElement(confirmPassword,details);          //Confirming password
    }
    public void clickOnRadioButton(String details){
        clickOnElement(radioButton);                  //Clicking on subscription radio buttons
    }
    public void clickOnCheckbox(){

        clickOnElement(checkBox);       //Clicking on Terms and condition checkbox
        clickOnElement(continueButton);     //continue button after registering all mandatory details
    }
    public String getMessage1() {
        return getTextFromElement(path1);   // method to verify Account Created
    }
    public void clickOnContinue1(){

       clickOnElement(continue1);        //Continue button after registration finishes
    }
    public String getMessage2() {

        return getTextFromElement(path2);   // method to verify Logout
    }
    public void clickOnContinue2(){
        clickOnElement(continue2);        //Continue button after log out to go on main page
    }
}