package ho.qat.stepDefinitions;

import ho.qat.utility.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class GetBitcoinRateSteps {

    private Response response;
    private String baseUrl = ConfigReader.getProperty("baseUrl");
    private String currencyCode = ConfigReader.getProperty("currencyCode");
    private double bitcoinRateInGBP;

    @Given("I set the base URI for Coinbase API")
    public void i_set_the_base_uri_for_coinbase_api() {
        response = given().get(baseUrl);
    }

    @When("I send a GET request to the endpoint to get current Bitcoin price")
    public void i_send_a_get_request_to_the_endpoint_to_get_current_bitcoin_price() {
        response.then().statusCode(200);
    }

    @Then("I extract the Bitcoin price in GBP to print")
    public void i_extract_the_bitcoin_price_in_gbp_to_print() {
        bitcoinRateInGBP = response.jsonPath().getDouble("bpi." + currencyCode + ".rate_float");
    }

    @Then("I print the bitcoin rate in GBP")
    public void printBitcoinRateInGBP() {
        System.out.println("Current Bitcoin rate in GBP: " + bitcoinRateInGBP);
    }
}
