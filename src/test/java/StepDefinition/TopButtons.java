package StepDefinition;

import Pages.DialogContent;
import Pages.TopNav;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TopButtons {
    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav();

    @Given("I am on the {string} page")
    public void ıAmOnThePage(String initialPage) {
        switch (initialPage) {
            case "Home":
                GWD.getDriver().get("https://obot.fun/");
                break;
            default:
                Assert.fail("Page " + initialPage + " is not defined.");
        }
    }

    @When("I click the {string}")
    public void ıClickThe(String button) {
        WebElement relatedButton;
        switch (button) {
            case "Price Button":
                relatedButton = tn.priceButton;
                break;
            case "Timer Button":
                relatedButton = tn.timerButton;
                break;
            case "Main Button":
                relatedButton = tn.mainButton;
                break;
            default:
                throw new IllegalArgumentException("Button " + button + " is not defined.");
        }
        tn.myClick(relatedButton);
    }

    @Then("I should be navigated to the {string} page")
    public void ıShouldBeNavigatedToThePage(String expectedPage) {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        switch (expectedPage) {
            case "Price Page":
                Assert.assertTrue(currentUrl.contains("/obot"));
                break;
            case "Timer Page":
                Assert.assertTrue(currentUrl.contains("/timer"));
                break;
            case "Main Page":
                Assert.assertTrue(currentUrl.equals("https://obot.fun/"));
                break;
            default:
                Assert.fail("Expected page " + expectedPage + " is not defined.");
        }
    }
}
