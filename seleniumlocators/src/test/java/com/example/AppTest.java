package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        // driver.manage().window().maximize();
        //driver.findElement(By.id("email")).sendKeys("uehjhasbdghw");
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("MacBook air")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Cart")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
