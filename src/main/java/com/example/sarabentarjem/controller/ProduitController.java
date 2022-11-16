package com.example.sarabentarjem.controller;

import com.example.sarabentarjem.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Produit")
@RestController
public class ProduitController {
    @Autowired
    IProduitService iProduitService ;


    @PutMapping("/assign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable int idProduit, @PathVariable int idStock){
        iProduitService.assignProduitToStock(idProduit,idStock);
    }


}
