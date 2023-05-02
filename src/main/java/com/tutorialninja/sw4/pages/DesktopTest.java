package com.tutorialninja.sw4.pages;

import com.tutorialninja.sw4.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopTest extends Utility {

    By listProducts = By.xpath("//h4/a");
    By path = By.xpath("//h1[contains(text(),'HP LP3065')]");         //path to verify desktop name text
    By sortOut = By.id("input-sort");
    By desktop = By.xpath("//a[contains(text(),'HP LP3065')]");
    By dropdown1 = By.xpath("//ul[@class = 'dropdown-menu']/li");  //currency selection path
    String text = "Name (Z - A)";
    String text1 = "Name (A - Z)";
    By text2 = By.xpath("//button[contains(text(),'£Pound Sterling')]");         //currency selection
    By currency = By.xpath("//span[contains(text(),'Currency')]");
    String year = "2023";
    String month = "November";
    String date = "30";
    By calendarPath = By.xpath("//div[@class = 'input-group date']//button");
    By nextButton = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By textFromCalendar = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By cart = By.xpath("//button[@id='button-cart']");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By path7 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");         //path to verify desktop name text
    By path4 = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/small[1]");         //path to verify desktop name text
    By path5 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");         //path to verify desktop name text
    By path6 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");         //path to verify desktop name text


    /**
     * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
     * 1.1 Mouse hover on Desktops Tab. and click
     * 1.2 Click on “Show All Desktops”
     * 1.3 Select Sort By position "Name: Z to A"
     * 1.4 Verify the Product will arrange in Descending order.
     */

    public void clickonDropdownCurrency() {
        //selectByVisibleTextFromDropDown(currency, text2);
        clickOnElement(currency);
    }

    public void clickonPoundSterling() {
        //selectByVisibleTextFromDropDown(currency, text2);
        clickOnElement(text2);
    }

    public void verifyProductArrangeInAlphabeticalOrder() {
        // Get all the products name and stored into array list
        getSorted(listProducts);
    }

    public void sortOutAlphabeticalDsc() {

        selectByVisibleTextFromDropDown(sortOut, text);
    }

    public void sortOutAlphabeticalAsc() {

        selectByVisibleTextFromDropDown(sortOut, text1);
    }

    public void calendarDeliveryDate(String year, String month, String date) {
        //2.6 Select Delivery Date "2023-11-30"
        clickOnElement(calendarPath);
        while (true) {
            String monthAndYear = getTextFromElement(textFromCalendar);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButton);
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnLaptop() {

        mouseHoverToElementAndClick(desktop);
    }

    public String getMessage() {

        return getTextFromElement(path);   // method to verify laptop text
    }

    public void addToCartButton() {

        clickOnElement(cart);              //Clicking on add to cart
    }

    public void clickOnShoppingCart() {

        clickOnElement(shoppingCart);      //Clicking on shopping cart
    }

    public String getMessage4() {

        return getTextFromElement(path4);  // method to verify the date of delivery

    }

    public String getMessage5() {

        return getTextFromElement(path5);  // method to verify the Product number

    }

    public String getMessage6() {

        return getTextFromElement(path6);  // method to verify the price
    }

    public String getMessage7() {

        return getTextFromElement(path7);  // method to verify laptop Name text
    }


}