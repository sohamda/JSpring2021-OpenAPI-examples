package soham.spring.openapiclient;

import org.openapitools.client.api.ProviderApiApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OpenapiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiClientApplication.class, args);
	}

	@EventListener
	public void withRestTemplate(ApplicationReadyEvent event) {
		ProviderApiApi providerApiApi = new ProviderApiApi();

		System.out.println(providerApiApi.getProviderByID(3));

	}
}
