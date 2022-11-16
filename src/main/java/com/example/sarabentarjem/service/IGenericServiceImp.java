package com.example.sarabentarjem.service;

import com.example.sarabentarjem.Entity.Stock;
import com.example.sarabentarjem.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

public class IGenericServiceImp<T, ID> implements IGenericService<T, ID> {
    @Autowired
    public GenericRepository<T,ID> genericRepository ;


    @Override
    public T add(T entity) {
        return genericRepository.save(entity);
    }

    @Override
    public List<T> retrieveAll() {
        return genericRepository.findAll();
    }

    @Override
    public T Update(T ce) {
        try {
            System.out.println("mise a jour avec succes");
            genericRepository.save(ce);
        } catch (Exception err) {
            System.out.println("Un erreur est survenue : " + err);
        }
        return ce ;
    }

    @Override
    public T getById(ID id) {
        return genericRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(ID id) {
        genericRepository.deleteById(id);

    }
}

