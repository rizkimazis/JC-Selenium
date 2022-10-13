package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

//        webDriverManager.chromedriver().setup();

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Untuk memperbesar tampilan layar
        driver.manage().window().maximize();

        // untuk memanggil browser
        //driver.get("https://www.google.com");

        String url = "https://demoqa.com/text-box";

        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        System.out.println("Input Username");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        System.out.println("Input User Email");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        System.out.println("Input Current Address");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        System.out.println("Input Permanent Address");

        // Scroll Vertical 1000 pixel
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.id("submit")).click();
        System.out.println("Button Submit Clicked");

        // delay
        Thread.sleep(3000);

        driver.quit();
    }
}