package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class Com_Saucedemo {

    static String baseUrl = "https://www.saucedemo.com/";
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        // Step 1: Setup browser

        if (browser.trim().equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.trim().equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.trim().equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser");
        }

        // Step 2 : Open the URL into Browser
        driver.get(baseUrl);

        //  Step 3 : Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Step 4 : print the current url
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Step 5 : Print the page source.
        System.out.println(driver.getPageSource());

        // Step 6 :  Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");

        // Step 7 :  Enter the password to password field.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Step 8: Click on Login Button.
        WebElement loginButton = driver.findElement(By.cssSelector(".btn_action"));
        loginButton.click();

        // Step 9 : Print the current url.
        System.out.println("The current url : " + driver.getCurrentUrl());

        //  Step 10 : Navigate to baseUrl
        driver.navigate().to(baseUrl);

        // Step 11 :  Refresh the page.
        driver.navigate().refresh();

        //  Step 12 : Close the browser.
        driver.quit();

    }
}
