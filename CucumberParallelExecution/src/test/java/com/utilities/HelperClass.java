package com.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;

public class HelperClass {
	
	//Sequential execution
	/*private static HelperClass helperClass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT = 10;
	
	HelperClass() {
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		} 

	public static void openPage(String url) {
		driver.get(url);
		}
	
	public static WebDriver getDriver() {
		return driver; 
		}

	public static void setUpDriver() {
		if (helperClass==null) {
			helperClass = new HelperClass();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		helperClass = null;
	} */
	
	//Parallel Execution
	  private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	  private static ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();
	  public final static int TIMEOUT = 10;

	  public static void setUpDriver() {
	        WebDriver webDriver = new ChromeDriver();
	        driver.set(webDriver);
	        wait.set(new WebDriverWait(webDriver, Duration.ofSeconds(TIMEOUT)));

	        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	        webDriver.manage().window().setSize(new Dimension(1920,1080));
	  }

	  public static WebDriver getDriver() {
	        return driver.get();
	    }

	  public static WebDriverWait getWait() {
	        return wait.get();
	  }

	  public static void openPage(String url) {
	        getDriver().get(url);
	  }

	  public static void tearDown() {
	        getDriver().quit();
	        driver.remove();
	        wait.remove();
	  }
}
