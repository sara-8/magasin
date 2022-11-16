package com.example.sarabentarjem.service;

import com.example.sarabentarjem.Entity.Facture;
import com.example.sarabentarjem.Entity.Fournisseur;
import com.example.sarabentarjem.repository.FactureRepository;
import com.example.sarabentarjem.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FactureServiceImp implements FactureService {
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Autowired
    FactureRepository factureRepository ;


    @Override
    public Facture addFacture(Facture f, int idFournisseur){
           Fournisseur fournisseur= fournisseurRepository.findById(idFournisseur).orElse(null);
            f.setFournisseur(fournisseur);
            return factureRepository.save(f);
        }




}
