package com.example.sarabentarjem.controller;

import com.example.sarabentarjem.Entity.DetailFournisseur;
import com.example.sarabentarjem.Entity.Stock;
import com.example.sarabentarjem.service.DetailFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/DetailF")
@RestController
public class DetailFournisseurController {

    @Autowired
     DetailFournisseurService detailFournisseurService;

    @PostMapping("/add")
    public DetailFournisseur add(@RequestBody DetailFournisseur detailFournisseur) {
        return detailFournisseurService.add(detailFournisseur);
    }
    @GetMapping("/getAll")
    public List<DetailFournisseur> retrieveAll(){
        return detailFournisseurService.retrieveAll();

    }
    @PutMapping("/update")
    public DetailFournisseur Update(@RequestBody DetailFournisseur stock) {
        return detailFournisseurService.Update(stock);
    }

    @RequestMapping(value = { "/{id}"})
    public DetailFournisseur getById(@PathVariable(name = "id") int id){
        return detailFournisseurService.getById(id) ;

    }

    @DeleteMapping(value = {"/delete/{id}"})
    public void delete(@PathVariable  int id ) {
        detailFournisseurService.delete(id );

    }
}
