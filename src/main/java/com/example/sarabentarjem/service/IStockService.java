package com.example.sarabentarjem.service;

import com.example.sarabentarjem.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.Provider;
import java.util.List;

public interface IStockService {

    public Stock add(Stock stock) ;
    public List<Stock> retrieveAll();
    public Stock Update(Stock stock) ;
    public Stock getById(int id);


    public void delete(int id ) ;
}
