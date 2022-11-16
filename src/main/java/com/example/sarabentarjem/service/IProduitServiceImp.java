package com.example.sarabentarjem.service;

import com.example.sarabentarjem.Entity.Produit;
import com.example.sarabentarjem.Entity.Stock;
import com.example.sarabentarjem.repository.ProduitRepository;
import com.example.sarabentarjem.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class IProduitServiceImp implements  IProduitService {
@Autowired
    ProduitRepository produitRepository ;
@Autowired
    StockRepository stockRepository ;



    @Override
    public void assignProduitToStock(int idProduit, int idStock) {
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        Stock stock=stockRepository.findById(idStock).orElse(null);
        if(produit!=null && stock!=null){
            produit.setStock(stock);
            produitRepository.save(produit);
        }

    }
}
