package com.example.sarabentarjem.service;

import com.example.sarabentarjem.Entity.Stock;
import com.example.sarabentarjem.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IStockServiceImp implements IStockService{
    @Autowired
    public StockRepository stockRepository ;

    @Override
    public Stock add(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> retrieveAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stock Update(Stock stock) {
        try {
            System.out.println("mise a jour avec succes");
            stockRepository.save(stock);
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }
        return stock ;
    }

    @Override
    public Stock getById(int id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {

        stockRepository.deleteById(id);
    }
}
