package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
         features = "src/test/resources/features",
         glue = "com.definitions1",
         plugin = {
        		 "pretty", 
        		 "html:target/cucumber-reports/cucumber.html", 
        		 "json:target/cucumber-reports/cucumber.json", 
        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			 	 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
         },
         monochrome = true)

public class runnerTestNG1 extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
      return super.scenarios();
    }
}

