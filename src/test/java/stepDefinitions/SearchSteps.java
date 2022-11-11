package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class SearchSteps {

    WebDriver driver;

    public SearchSteps() {
        this.driver = Hooks.driver;
    }

    @When("user searches for {string}")
    public void userSearchesForItem(String item) {
        driver.findElement(By.cssSelector(".header2021-search-box > input:nth-child(1)")).sendKeys(item);
        driver.findElement(By.cssSelector("button.ico")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("user sees search results for {string}")
    public void userSeesSearchResultsForItem(String item) {
        Assertions.assertEquals("Search Results: \"" + item + "\"", driver.findElement(By.cssSelector("li.is-current")).getText(), "Search results shown");
    }

    @Then("user sees that no search items are found")
    public void userSeesThatNoSearchIteamsAreFound(String item) {
        Assertions.assertEquals("Search Results: \"" + item + "\"", driver.findElement(By.cssSelector("li.is-current")).getText(), "Search results shown");
        Assert.assertEquals("We have found 0 items that match \"" + item + "\"", driver.findElement(By.cssSelector(".result-message-error")).getText(), "There are no search results");
    }

}
