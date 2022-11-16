package com.example.sarabentarjem.repository;

import com.example.sarabentarjem.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository  extends JpaRepository<Stock,Integer > {
}
