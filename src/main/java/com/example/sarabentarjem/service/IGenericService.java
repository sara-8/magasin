package com.example.sarabentarjem.service;

import com.example.sarabentarjem.Entity.Stock;

import java.util.List;

public interface IGenericService<T,ID> {
    public T add(T entity) ;
    public List<T> retrieveAll();
    public T Update(T ce) ;
    public T getById(ID id);


    public void delete(ID id ) ;
}
