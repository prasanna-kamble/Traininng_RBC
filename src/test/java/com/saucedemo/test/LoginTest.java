package com.saucedemo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver-win64\\chromedriver.exe"); // Update path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginToSauceDemo() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("Login Successful!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
