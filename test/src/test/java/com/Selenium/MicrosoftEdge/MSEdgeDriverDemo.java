package com.Selenium.MicrosoftEdge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MSEdgeDriverDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\Hound-LP\\Desktop\\Personal Projects\\Selenium\\WebDrivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://girdharithakur.in");
        Thread.sleep(6000);

        driver.quit();

    }
}
