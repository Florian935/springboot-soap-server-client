package com.tptrain.soapserver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Source;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.noFault;
import static org.springframework.ws.test.server.ResponseMatchers.payload;

@SpringBootTest
class SoapserverApplicationTests {
	private MockWebServiceClient mockClient;

	@Autowired
	private ApplicationContext applicationContext;

	@BeforeEach
	public void createClient() {
		mockClient = MockWebServiceClient.createClient(applicationContext);
	}

	@Test
	void facturesEndpoint() {
		Source requestPayload = new StringSource("<loc:getFactureRequest xmlns:loc=\"http://localhost:8080\">\n" +
				"         <loc:id>1</loc:id>\n" +
				"      </loc:getFactureRequest>"
		);

		Source responsePayload = new StringSource("<ns2:getFactureResponse xmlns:ns2=\"http://localhost:8080\">\n" +
				"         <ns2:facture>\n" +
				"            <ns2:id>1</ns2:id>\n" +
				"            <ns2:nom>Facture 1</ns2:nom>\n" +
				"            <ns2:prix>10</ns2:prix>\n" +
				"         </ns2:facture>\n" +
				"      </ns2:getFactureResponse>");

		mockClient.sendRequest(withPayload(requestPayload))
				.andExpect(noFault())
				.andExpect(payload(responsePayload));
	}

}
