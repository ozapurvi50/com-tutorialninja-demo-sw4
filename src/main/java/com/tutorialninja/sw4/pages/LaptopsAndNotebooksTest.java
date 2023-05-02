package com.tutorialninja.sw4.pages;

import com.tutorialninja.sw4.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LaptopsAndNotebooksTest extends Utility {

    By sortOut = By.xpath("//p[@class ='price']");
    By path = By.id("input-sort");
    String text = "Price (High > Low)";
    By product = By.linkText("MacBook");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By path4 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By sendQuantity = By.xpath("//input[contains(@name, 'quantity')]");
    By update = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By path5 = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By path6 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkOutButton = By.xpath("//a[@class='btn btn-primary']");
    By path7 = By.xpath("//h1[normalize-space()='Checkout']");
    By path8 = By.xpath("//h2[normalize-space()='New Customer']");
    By path1 = By.xpath("//h1[contains(text(),'MacBook')]");
    public void arrangePriceWise() {
        arrangeProductsPriceWise(sortOut);
    }
    public void sortOutPriceHighToLow() {
        selectByVisibleTextFromDropDown(path, text);
    }
    public void clickOnProduct() {
        clickOnElement(product);
    }
    public String getMessage() {
        return getTextFromElement(path1);
    }
    public void shoppingCart() {
        clickOnElement(shoppingCart);
    }
    public String getMessage3() {
        return getTextFromElement(path4);
    }
    public void sendQuantity(String text) {
        sendTextToElement(sendQuantity, text);
    }
    public void update() {
        clickOnElement(update);
    }
    public String getMessage4() {
        return getTextFromElement(path5);
    }
    public String getMessage5() {
        return getTextFromElement(path6);
    }
    public void checkOut() {
        clickOnElement(checkOutButton);
    }                    //Click on checkout button
    public String getMessage6() {
        return getTextFromElement(path7);
    }             //Verify Checkout
    public String getMessage7() {
        return getTextFromElement(path8);
    }             //Verify New Customer
}