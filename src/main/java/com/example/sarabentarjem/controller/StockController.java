package com.example.sarabentarjem.controller;

import com.example.sarabentarjem.Entity.Stock;
import com.example.sarabentarjem.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    IStockService iStockService ;

    @PostMapping("/add")
    public Stock add( @RequestBody Stock stock) {
        return iStockService.add(stock);
    }
    @GetMapping("/getAll")
    public List<Stock> retrieveAll(){
        return iStockService.retrieveAll();

    }
    @PutMapping("/update")
    public Stock Update(Stock stock) {
        return iStockService.Update(stock);
    }

    @RequestMapping(value = { "/{id}"})
    public Stock getById(@PathVariable(name = "id") int id){
        return iStockService.getById(id) ;

    }

    @DeleteMapping(value = {"/delete/{id}"})
    public void delete(@PathVariable  int id ) {
        iStockService.delete(id );

    }

}
