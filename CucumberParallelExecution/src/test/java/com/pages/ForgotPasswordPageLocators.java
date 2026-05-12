package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPageLocators {
	WebDriver driver;
	 
	@FindBy (xpath= "//*[@id='app']/div[1]/div[1]/div/form/h5")
    public  WebElement forgotPasswordPageTitle;
    
	@FindBy (xpath= "//*[@id='app']/div[1]/div[1]/div/form/div[2]/button[1]")
    public  WebElement cancelBtn;
    
	@FindBy (xpath= "//*[@id='app']/div[1]/div[1]/div/form/div[2]/button[2]")
    public  WebElement resetPasswordBtn;
    
    @FindBy  (name = "username")
    public  WebElement userName;
    
    @FindBy (xpath= "//*[@id='app']/div[1]/div[1]/div/h6")
    public  WebElement resetMessage;

   
}