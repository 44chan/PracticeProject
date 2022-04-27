package com.practice.pages;

import com.practice.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPage {

    @FindBy(xpath = "//input[.='Example']")
    public WebElement inputCurBtn;

    @FindBy(xpath = "//select[.='Example']")
    public WebElement fromCurBtn;

    @FindBy(xpath = "//select[.='Example']")
    public WebElement toCurBtn;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement convertBtn;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement fromCurCodes;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement toCurCodes;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement fromCurNames;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement toCurNames;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement resultFromBothComputation;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement resultFromBothDateAndTime;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement rateHistory;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement givenDay;

    @FindBy(xpath = "//id[.='Example']")
    public WebElement defaultAmount;


    // I am putting everything in one method to save time but in reality i would create more separate methods for selecting specific web elm and ect..
    public void operateWithCurrenciesMethod(String amount){

        inputCurBtn.sendKeys(amount);

        Select obj = new Select(fromCurBtn);
        obj.selectByIndex(1);

        Select obj2 = new Select(toCurBtn);
        obj.selectByIndex(2);

        convertBtn.click();
    }

    public void chartForRateHistoryToGivenDay(String day ){

        if (rateHistory.getText().contains(day)){
            System.out.println(rateHistory.getText());
        }

    }

    public void defaultAmountConversion(){

        inputCurBtn.sendKeys(defaultAmount.getText());
        convertBtn.click();

    }

    public void changedAmountConversion(String changedAmount){

        inputCurBtn.sendKeys(changedAmount);
        convertBtn.click();

    }


    public void MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
