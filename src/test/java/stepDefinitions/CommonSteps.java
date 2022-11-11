package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;


public class CommonSteps {

    WebDriver driver;

    public CommonSteps() {
        this.driver = Hooks.driver;
    }

    @Given("user opens website")
    public void open_website() {
        driver.get("https://www.newegg.com/");
        System.out.println(driver.getCurrentUrl());
    }
}
