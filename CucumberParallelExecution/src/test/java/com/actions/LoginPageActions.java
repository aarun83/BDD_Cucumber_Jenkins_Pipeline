package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocators;
import com.utilities.HelperClass;

public class LoginPageActions {
	LoginPageLocators loginPageLocators = null; 
	String strUserName, strPassword;
    
    public LoginPageActions() {
  
        this.loginPageLocators = new LoginPageLocators();
  
        PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
    }
    
    // Set user name in textbox
    public void setUserName(String strUserName) {
        loginPageLocators.userName.sendKeys(strUserName);
    }
   
    // Set password in password textbox
    public void setPassword(String strPassword) {
        loginPageLocators.password.sendKeys(strPassword);
    }
       // Click on login button
    public void clickLogin() {
        loginPageLocators.login.click();
    }
    
 // Get the Error Message from Login Page
 	public String getErrorMessageText() {
 		return loginPageLocators.errorMessage.getText();
 	}
 	
    public void login() {

    InputStream fileInput = getClass()
            .getClassLoader()
            .getResourceAsStream("testdata.properties");

    if (fileInput == null) {
        throw new RuntimeException("testdata.properties not found in src/test/resources");
    }

    Properties prop = new Properties();

    try {
        prop.load(fileInput);
    } catch (IOException e) {
        throw new RuntimeException("Failed to load properties file", e);
    }

    String strUserName = prop.getProperty("username");
    String strPassword = prop.getProperty("password");

    this.setUserName(strUserName);
    this.setPassword(strPassword);
    this.clickLogin();
	}
}
