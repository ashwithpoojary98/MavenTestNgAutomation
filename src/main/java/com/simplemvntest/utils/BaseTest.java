package com.simplemvntest.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	String baseURL = "http://automationpractice.com/index.php";
	String username = "dofif32949@moxkid.com";
	String password = "Test@123";
	String browser = "chrome";

	    private WebDriver driver;

	    @BeforeSuite
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }

	    @BeforeTest
	    public void setupTest() {
	        driver = new ChromeDriver();
	        driver.get(baseURL);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }

	    @AfterTest
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

