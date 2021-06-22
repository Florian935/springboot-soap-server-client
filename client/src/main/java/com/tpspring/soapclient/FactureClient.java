package com.tpspring.soapclient;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class FactureClient extends WebServiceGatewaySupport {
    public GetFactureResponse getFacture(String id) {
        GetFactureRequest request = new GetFactureRequest();
        request.setId(id);

        GetFactureResponse response = (GetFactureResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/factures", request, new SoapActionCallback("http://localhost:8080/ws/getFactureRequest"));

        return response;
    }

    public GetFacturesResponse getFactures() {
        GetFacturesRequest request = new GetFacturesRequest();
        GetFacturesResponse response = (GetFacturesResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/factures", request, new SoapActionCallback("http://localhost:8080/ws/getFacturesRequest"));

        return response;
    }

    public AddFactureResponse addFacture(Facture facture) {
        AddFactureRequest request = new AddFactureRequest();
        request.setFacture(facture);

        AddFactureResponse response = (AddFactureResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/factures", request, new SoapActionCallback("http://localhost:8080/ws/addFactureRequest"));

        return response;
    }
}
