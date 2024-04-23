package self_tutorial.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import self_tutorial.pages.W3Page;
import self_tutorial.utils.Driver;

import javax.swing.*;
import java.time.Duration;

public class W3Schools_Double_Click {


    /*
    C #1: Double Click Test
    1. Go to
    https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    2. Switch to iframe.
    3. Double click on the text “Double-click me to change my text color.”
    4. Assert: Text’s “style” attribute value contains “red”.

     */

    W3Page w3Page = new W3Page();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user launches the target page")
    public void user_launches_the_target_page() {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        w3Page.popUpAccept.click(); //to accept the privacy settings on page
    }
    @When("user double clicks the target element")
    public void user_double_clicks_the_target_element() {
        Driver.getDriver().switchTo().frame("iframeResult"); // on the page there is an iframe that we have to switch to
        wait.until(ExpectedConditions.elementToBeClickable(w3Page.doubleClickMe));
        actions.doubleClick(w3Page.doubleClickMe).perform();
    }
    @Then("user should see colour of web element changed red")
    public void user_should_see_colour_of_web_element_changed_red() {
        String actualAttributeValue = w3Page.doubleClickMe.getAttribute("style");
        String expectedInAttributeValue = "color: red;";
        System.out.println("actualAttributeValue = " + actualAttributeValue);
        System.out.println("expectedInAttributeValue = " + expectedInAttributeValue);
        Assert.assertEquals(expectedInAttributeValue, actualAttributeValue);
    }



}
