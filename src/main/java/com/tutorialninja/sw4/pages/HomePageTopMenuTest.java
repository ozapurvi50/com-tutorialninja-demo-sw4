package com.tutorialninja.sw4.pages;

import com.tutorialninja.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class HomePageTopMenuTest extends Utility {

    By message = By.xpath("//h2[contains(text(),'Desktops')]");
    By desktop = By.linkText("Desktops");
    By allDesktop = By.linkText("Show AllDesktops");
    By message1 = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By laptopNotebooks = By.linkText("Laptops & Notebooks");
    By allNotebooks = By.linkText("Show AllLaptops & Notebooks");
    By message3 = By.xpath("//h2[contains(text(),'Components')]");
    By components = By.linkText("Components");
    By allcomponents = By.linkText("Show AllComponents");

    public String getMessage() {

        return getTextFromElement(message);
    }
    public void clickOnHomePageButtons() {
        mouseHoverToElementAndClick(desktop);
        mouseHoverToElementAndClick(allDesktop);
    }
    public void clickOnHomePageButtons1() {
        mouseHoverToElementAndClick(laptopNotebooks);
        mouseHoverToElementAndClick(allNotebooks);
    }
    public String getMessage1() {
        return getTextFromElement(message1);
    }
    public void clickOnHomePageButtons2() {
        mouseHoverToElementAndClick(components);
        mouseHoverToElementAndClick(allcomponents);
    }
    public String getMessage2() {
        return getTextFromElement(message3);

    }

}





