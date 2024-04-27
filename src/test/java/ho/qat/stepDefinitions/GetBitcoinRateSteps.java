package ho.qat.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.*;


public class GetBitcoinRateSteps {

    private Response response;

    @Given("I make a GET request to {string}")
    public void i_make_a_get_request_to(String url) {
        response = given().get(url);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the Bitcoin rate in GBP should be printed")
    public void the_bitcoin_rate_in_gbp_should_be_printed() {
        String bitcoinRateGBP = response.jsonPath().getString("bpi.GBP.rate");
        System.out.println("Bitcoin rate in GBP: " + bitcoinRateGBP);
    }
}
