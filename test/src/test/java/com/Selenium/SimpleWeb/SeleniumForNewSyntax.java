package com.Selenium.SimpleWeb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumForNewSyntax {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        // Implicit Wait

        // (old Wait) driver.manage().timeouts().implicitlywait(3, TimeUnit.Seconds);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Eplicit wait

        // (old) WebDriverWait wait= new WebDriverWait(driver, 3)

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        // Desired Capabilities --> Rplaced with Options
        // (Old) DesiredCapabilities caps = DesiredCapabilities.firefox();

        ChromeOptions options = new ChromeOptions();

    }
}
