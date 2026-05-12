package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
         features = "src/test/resources/features/LoginPage1.feature",
         glue = "com.definitions1",
         plugin = {
        		 "pretty", 
        		 "html:target/cucumber-reports.html", 
        		 "json:target/cucumber.json", 
        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
         },
         monochrome = true)

public class runnerTestNG1 extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
      return super.scenarios();
    }

}

