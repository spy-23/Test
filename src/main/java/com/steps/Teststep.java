package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teststep {


    @Given("user navigates to the website javatpoint.com")
    public void user_navigates_to_the_website_javatpoint_com() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(10000);
        System.out.println("Hi");
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("there user logs in through Login Window by using Username as {string} and Password as {string}")
    public void there_user_logs_in_through_login_window_by_using_username_as_and_password_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("login must be successful.")
    public void login_must_be_successful() {
        // Write code here that turns the phrase above into concrete actions

    }
}
