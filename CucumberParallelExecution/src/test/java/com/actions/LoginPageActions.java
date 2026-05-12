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
    	File file = new File("C:\\Java-Selenium-Automation\\CucumberPageObjectExtentReport\\src\\test\\resources\\testdata.properties");
  	  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		strUserName = prop.getProperty("username");
		strPassword = prop.getProperty("password");
		
        // Fill user name
        this.setUserName(strUserName);
   
        // Fill password
        this.setPassword(strPassword);
   
        // Click Login button
        this.clickLogin();
    }
}