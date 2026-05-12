package com.definitions1;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	//Sequential Execution
	/*
	@Before 
    public static void setUp() {
       HelperClass.setUpDriver();
    }
 
    @After
    public static void tearDown(Scenario scenario) {
 
        HelperClass.tearDown();
    } */
	
	//parallel execution
	
	@Before
    public void setUp() {
        HelperClass.setUpDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        HelperClass.tearDown();
    }

}