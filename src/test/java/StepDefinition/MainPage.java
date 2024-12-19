package StepDefinition;

import Pages.DialogContent;
import Pages.TopNav;
import Utility.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MainPage {
    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav();

    @Given("the user navigates to the homepage")
    public void theUserNavigatesToTheHomepage() {
        GWD.getDriver().get("https://obot.fun/");
    }

    @Then("the following elements should be visible:")
    public void theFollowingElementsShouldBeVisible(DataTable table) {
        List<String> elements = table.asList();
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = tn.getWebElement(elements.get(i));

            if (element != null) {
                Assert.assertTrue(element.isDisplayed(), "Element " + elements.get(i) + " should be visible.");
            } else {
                Assert.fail("Element " + elements.get(i) + " not found.");
            }
        }

    }
}

