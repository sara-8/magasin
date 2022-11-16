package com.example.sarabentarjem.controller;

import com.example.sarabentarjem.service.IOperateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/DetailF")
@RestController
public class OperateurController {
@Autowired
    IOperateurService  iOperateurService ;


    @PutMapping("/assi/{idOperateur}/{idFacture}")
    public void assignOperateurToFacture(int idOperateur, int  idFacture)
    {
        iOperateurService.assignOperateurToFacture(idOperateur,idFacture);
    }
}
