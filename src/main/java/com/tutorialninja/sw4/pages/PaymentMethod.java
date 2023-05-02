package com.tutorialninja.sw4.pages;

import com.tutorialninja.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class PaymentMethod extends Utility {

    By textBox = By.xpath("//textarea[@name='comment']");
    By shippingMethod = By.id("button-shipping-method");
    By path9 =By.xpath("//div[contains(text(), 'Warning: Payment method required!')]");
    By privacyPolicy = By.xpath("//input[@name='agree']");
    By guestContinue = By.xpath("//input[@id='button-payment-method']");

    public void sendTextToTextbox(String text) {
        sendTextToElement(textBox, text);
    }
    public void button(){
        clickOnElement(shippingMethod);
    }
    public String getMessage8() {
        return getTextFromElement(path9);
    }
    public void clickOnPrivacyPolicy() {
        clickOnElement(privacyPolicy);
    }
    public void clickContinue(){clickOnElement(guestContinue);}
}
