package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class AddToCartSteps {
    WebDriver driver;

    public AddToCartSteps() {
        this.driver = Hooks.driver;
    }

    @When("user adds to cart gaming item xbox")
    public void userAddsToCartGamingItem() {
        driver.findElement(By.cssSelector("div.menu-level-2:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("dl.filter-box:nth-child(1) > dd:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("dl.filter-box:nth-child(2) > dd:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#item_cell_9SIB473HP53879_1_0 > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.nav-col:nth-child(2) > button:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".modal-footer > button:nth-child(1)")).click();

    }

    @Then("user views cart and sees item added")
    public void userViewsCartAndSeesItemAdded() {
        driver.findElement(By.cssSelector(".item-actions > button:nth-child(2)")).click();
        Assertions.assertEquals("Shopping Cart (1 Item)", driver.findElement(By.cssSelector(".row-title")).getText(), "One item is in cart");
    }

}
