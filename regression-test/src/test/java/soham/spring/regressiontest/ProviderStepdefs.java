package soham.spring.regressiontest;

import io.cucumber.java.en.Given;
import org.openapitools.client.api.ProviderApiApi;
import soham.spring.openapiclient.ApiException;

public class ProviderStepdefs {
    @Given("That provider {int} is there")
    public void thatProviderIsThere(int arg0) throws ApiException {

        ProviderApiApi providerApiApi = new ProviderApiApi();

        System.out.println(providerApiApi.getProviderByID(arg0));
    }
}
