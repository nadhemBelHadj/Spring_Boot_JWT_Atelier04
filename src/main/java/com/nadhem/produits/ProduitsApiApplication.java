package com.nadhem.produits;

import java.util.Date;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nadhem.produits.entities.Produit;
import com.nadhem.produits.service.ProduitService;

@SpringBootApplication
public class ProduitsApiApplication {
	@Autowired
	ProduitService produitService;


	public static void main(String[] args) {
		SpringApplication.run(ProduitsApiApplication.class, args);
	}

 /*	@PostConstruct
	void init_users() {
		produitService.saveProduit(new Produit(null,"PC Dell", 2600.0, new Date()));
		produitService.saveProduit(new Produit(null,"PC Asus", 2800.0, new Date()));
		produitService.saveProduit(new Produit(null,"Imp Epson", 900.0, new Date()));
	} 
*/
}
