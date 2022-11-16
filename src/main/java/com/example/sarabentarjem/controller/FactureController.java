package com.example.sarabentarjem.controller;

import com.example.sarabentarjem.Entity.Facture;
import com.example.sarabentarjem.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactureController {
@Autowired
    FactureService factureService ;

    @PostMapping("ad/{idFournisseur}")
    public Facture addFacture(@RequestBody Facture f,@PathVariable int idFournisseur){
        return factureService.addFacture(f,idFournisseur) ;

    }
}
