package com.capgemini.spacex.regressiontest;


import io.cucumber.java.en.Given;
import org.openapitools.client.api.ProviderApiApi;
import soham.spring.openapiclient.ApiException;

public class MyStepDefs {

    @Given("That provider {int} exists")
    public void thatProviderExists(int arg0) throws ApiException {
        ProviderApiApi providerApiApi = new ProviderApiApi();

        System.out.println(providerApiApi.getProviderByID(arg0));
    }
}
