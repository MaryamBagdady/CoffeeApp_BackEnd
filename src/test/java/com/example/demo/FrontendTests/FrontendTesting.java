package com.example.demo.FrontendTests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrontendTesting {
    WebDriver driver;

    private String frontpage = "http://localhost:4200/";

    public void Begin(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--kiosk");
        driver = new ChromeDriver(options);
    }

    @Test
    public void TestSeleniumStart() {
        Begin();
        driver.get(frontpage);
        Assert.assertEquals("AngularKoffie", driver.getTitle());
        Assert.assertTrue(driver.getPageSource().contains("AngularKoffie"));
        driver.close();
    }

    @Test
    public void TestFrontendGeeftErrorAlsWachtwoordminderDan6Is() {
        Begin();
        driver.get(frontpage);
        driver.findElement(new By.ById("Registreer")).click();
        driver.findElement(new By.ById("naam")).sendKeys("naam");
        driver.findElement(new By.ById("gebruikNaam")).sendKeys("naam");
        driver.findElement(new By.ById("kantoorNummer")).sendKeys("12");
        driver.findElement(new By.ById("wachtwoord")).sendKeys("niet6");
        driver.findElement(new By.ById("telefoonNummer")).sendKeys("0612345678");

        Assert.assertTrue(driver.getPageSource().contains("Wachtwoord moet minimaal 6 letters zijn."));
        driver.close();
    }

    @Test
    public void TestFrontendErrorAlsVeldLeegIs() {
        Begin();
        driver.get(frontpage);
        driver.findElement(new By.ById("Registreer")).click();
        driver.findElement(new By.ById("naam")).sendKeys("");
        driver.findElement(new By.ById("gebruikNaam")).sendKeys("naam");
        driver.findElement(new By.ById("kantoorNummer")).sendKeys("12");
        driver.findElement(new By.ById("wachtwoord")).sendKeys("wachtwoord");
        driver.findElement(new By.ById("telefoonNummer")).sendKeys("0612345678");

        Assert.assertTrue(driver.getPageSource().contains("Naam is vereist"));
        driver.close();
    }
}
