package com.example.sarabentarjem.service;

import com.example.sarabentarjem.Entity.Facture;
import com.example.sarabentarjem.Entity.Operateur;
import com.example.sarabentarjem.repository.FactureRepository;
import com.example.sarabentarjem.repository.OperateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IOperateurServiceImp implements  IOperateurService{
    @Autowired
    OperateurRepository operateurRepository ;
    @Autowired
    FactureRepository factureRepository ;

    @Override
    public void assignOperateurToFacture(int idOperateur, int idFacture) {

            Operateur operateur=operateurRepository.findById(idOperateur).orElse(null);
            Facture facture=factureRepository.findById(idFacture).orElse(null);
            if(operateur!=null && facture!=null)
            {
                operateur.getFactures().add(facture);
                operateurRepository.save(operateur);

        }
    }


}
