package uk.me.paulswilliams.addressbook.cukes;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

    @Given("^no entries exist$")
    public void no_entries_exist() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();

    }
    @When("^I create \"([^\"]*)\" with phone number (\\d+)$")
    public void I_create_with_phone_number(String name, int phoneNumber) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void I_search_for(String searchString) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should see the following entries$")
    public void I_should_see_the_following_entries(DataTable expectedSearchResults) throws Throwable {
        // Express the Regexp above with the code you wish you had
        // For automatic conversion, change DataTable to List<YourType>
        throw new PendingException();
    }

}
