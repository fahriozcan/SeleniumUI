package selftutorial.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import selftutorial.pages.MainPage;
import selftutorial.utils.ConfigurationReader;
import selftutorial.utils.Driver;

public class MainStepDefs {

    MainPage mainPage = new MainPage();

    @When("User launches the main page")
    public void user_launches_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @Then("User should see the top header")
    public void user_should_see_the_top_header() {
        Assert.assertTrue(mainPage.getTopHeader().isDisplayed());
    }

}
