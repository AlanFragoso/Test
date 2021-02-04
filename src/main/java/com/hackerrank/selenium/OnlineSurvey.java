package com.hackerrank.selenium;

import org.openqa.selenium.WebDriver;

public class OnlineSurvey {

    public static void fillDateOfBirth(WebDriver driver, String pageUrl) {
        // complete implementation
        Select drpMonth =new Select (driver.findElement(By.id("month")));
        Select drpDay =new Select (driver.findElement(By.id("day")));
        Select drpYear =new Select (driver.findElement(By.id("year")));
        
        drpMont.selectByValue("July");
        drpDay.selectByValue("12");
        drpYear.selectByValue("1991");
    }

    public static void answerQuestions(WebDriver driver, String pageUrl) {
        // complete implementation
        WebElement checkbox = driver.findElements(By.xpath("//input[@name='favorite_language']"));
        checkbox.click();
    }
}
