package com.tptrain.soapserver;

import localhost._8080.*;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class FacturesEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8080";
    private final List<Facture> factures = FacturesStub.getFactures();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFactureRequest")
    @ResponsePayload
    public GetFactureResponse getFacture(@RequestPayload GetFactureRequest request) {
        final String id = request.getId();

        final Facture factureFound = factures.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new FactureNotFoundFault("Facture non trouvée."));

        GetFactureResponse response = new GetFactureResponse();
        response.setFacture(factureFound);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFacturesRequest")
    @ResponsePayload
    public GetFacturesResponse getFactures() {

        GetFacturesResponse response = new GetFacturesResponse();
        response.getFacture().addAll(factures);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addFactureRequest")
    @ResponsePayload
    public AddFactureResponse addFacture(@RequestPayload AddFactureRequest request) {
        factures.add(request.getFacture());

        AddFactureResponse response = new AddFactureResponse();
        response.setFacture(request.getFacture());
        return response;
    }
}
