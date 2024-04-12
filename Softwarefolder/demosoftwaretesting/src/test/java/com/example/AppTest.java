package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.get("https://www.shoppersstop.com/");
        d.quit();














        // String t=d.getTitle();
        // System.out.println(t);
        // String curl=d.getCurrentUrl();
        // System.out.println(curl);

        // String p=d.getPageSource();
        // System.out.println(p);
    }
}
