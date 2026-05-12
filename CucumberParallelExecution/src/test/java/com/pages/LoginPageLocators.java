package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(name = "username")
    public WebElement userName;
  
    @FindBy(name = "password")
    public WebElement password;
  
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement login;
    
    @FindBy (xpath= "//*[@class='orangehrm-login-error']/div[1]/div[1]/p")
    public WebElement errorMessage;
    
    @FindBy (xpath= "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
    public WebElement forgotPasswordLink;
    
    @FindBy (xpath= "//*[@id='app']/div[1]/div/div[1]/div/div[2]/h5")
    public WebElement loginPageTitle;
}
