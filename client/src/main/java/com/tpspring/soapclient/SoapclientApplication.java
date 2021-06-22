package com.tpspring.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapclientApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(FactureClient factureClient) {
		return args -> {
			String id = "1";
			GetFactureResponse response = factureClient.getFacture(id);
			System.out.println(response.getFacture().getNom());

			GetFacturesResponse response2 = factureClient.getFactures();
			System.out.println(response2.getFacture().size());

			Facture facture = new Facture();
			facture.setId("30");
			facture.setNom("Facture 30");
			facture.setPrix(30);
			AddFactureResponse response3 = factureClient.addFacture(facture);
			System.out.println(response3.getFacture().getNom());

			GetFacturesResponse response4 = factureClient.getFactures();
			System.out.println(response4.getFacture().size());
		};
	}
}
