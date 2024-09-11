package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class FacebookTest {
    WebDriver driver;

    @Test
    void facebookSignup() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        WebElement createButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        createButton.click();
        Thread.sleep(2000);
        WebElement fname = driver.findElement(By.name("firstname"));
        fname.sendKeys("Ram");
        driver.findElement(By.name("lastname")).sendKeys("Kumar");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("sakthiram2677@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ramkumar@0706");
        driver.findElement(By.name("birthday_day")).click();
        driver.findElement(By.xpath("//select[@name=\"birthday_day\"]/option[@value=\"4\"]")).click();
        driver.findElement(By.name("birthday_month")).click();
        driver.findElement(By.xpath("//select[@name=\"birthday_month\"]/option[@value=\"6\"]")).click();
        driver.findElement(By.name("birthday_year")).click();
        driver.findElement(By.xpath("//select[@name=\"birthday_year\"]/option[@value=\"2002\"]")).click();
        driver.findElement(By.name("birthday_year")).click();

        driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"2\"]")).click();
        driver.findElement(By.name("websubmit")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.manage().window().minimize();
        driver.quit();
    }

    @Test
    void facebookLogin() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("sakthiram2677@gmail.com");
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("Ramkumar@0706");
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        Thread.sleep(5000);
        driver.manage().window().minimize();
        driver.quit();
    }
}