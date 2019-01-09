package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_FACEBOOK_FIRSTNAME = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div/div/div/div/div/input";
    public static final String XPATH_FACEBOOK_LASTNAME = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div/div/div[2]/div/div/input";
    public static final String XPATH_FACEBOOK_EMAIL = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div[2]/div/div/input";
    public static final String XPATH_FACEBOOK_EMAIL_SECOND = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div[3]/div/div/div/input";
    public static final String XPATH_FACEBOOK_PASSWORD = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div[5]/div/div/input";
    public static final String XPATH_FACEBOOK_DAY = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div[6]/div/span/span/select[1]";
    public static final String XPATH_FACEBOOK_MONTH = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div[6]/div/span/span/select[2]";
    public static final String XPATH_FACEBOOK_YEAR = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div[6]/div/span/span/select[3]";
    public static final String XPATH_FACEBOOK_GENDER = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div[7]/span/span[2]/input";
    public static final String XPATH_FACEBOOK_REGISTER = "//div[contains(@class, \"registration_redesign\")]/div/form/div/div[9]/button";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FACEBOOK_FIRSTNAME));
        firstnameField.sendKeys("Test name");

        WebElement lastnameField = driver.findElement(By.xpath(XPATH_FACEBOOK_LASTNAME));
        lastnameField.sendKeys("Test lastname");

        WebElement emailField = driver.findElement(By.xpath(XPATH_FACEBOOK_EMAIL));
        emailField.sendKeys("test@test.com");

        WebElement emailField2 = driver.findElement(By.xpath(XPATH_FACEBOOK_EMAIL_SECOND));
        emailField2.sendKeys("test@test.com");

        WebElement passwordField = driver.findElement(By.xpath(XPATH_FACEBOOK_PASSWORD));
        passwordField.sendKeys("testPassword");

        WebElement dayField = driver.findElement(By.xpath(XPATH_FACEBOOK_DAY));
        Select selectDay = new Select(dayField);
        selectDay.selectByIndex(1);

        WebElement monthField = driver.findElement(By.xpath(XPATH_FACEBOOK_MONTH));
        Select selectMonth = new Select(monthField);
        selectMonth.selectByIndex(7);

        WebElement yearField = driver.findElement(By.xpath(XPATH_FACEBOOK_YEAR));
        Select selectYear = new Select(yearField);
        selectYear.selectByIndex(32);

        WebElement genderField = driver.findElement(By.xpath(XPATH_FACEBOOK_GENDER));
        genderField.click();

        WebElement registerFinish = driver.findElement(By.xpath(XPATH_FACEBOOK_REGISTER));
        registerFinish.click();
    }
}
