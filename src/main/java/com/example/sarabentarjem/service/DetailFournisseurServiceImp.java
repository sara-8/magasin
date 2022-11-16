package com.example.sarabentarjem.service;

import com.example.sarabentarjem.Entity.DetailFournisseur;
import com.example.sarabentarjem.repository.DetailFournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailFournisseurServiceImp extends IGenericServiceImp<DetailFournisseur,Integer> implements DetailFournisseurService {
    @Autowired
    protected DetailFournisseurRepository detailFournisseurRepository ;
}
