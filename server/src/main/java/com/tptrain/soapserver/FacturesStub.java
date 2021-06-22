package com.tptrain.soapserver;

import localhost._8080.Facture;

import java.util.ArrayList;
import java.util.List;

public abstract class FacturesStub {

    public static List<Facture> getFactures() {
        final List<Facture> factures = new ArrayList<>();
        Facture facture1 = new Facture();
        facture1.setId("1");
        facture1.setNom("Facture 1");
        facture1.setPrix(10);

        Facture facture2 = new Facture();
        facture2.setId("2");
        facture2.setNom("Facture 2");
        facture2.setPrix(20);

        Facture facture3 = new Facture();
        facture3.setId("3");
        facture3.setNom("Facture 3");
        facture3.setPrix(30);

        factures.add(facture1);
        factures.add(facture2);
        factures.add(facture3);

        return factures;
    }
}
