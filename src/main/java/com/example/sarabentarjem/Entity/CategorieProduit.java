package com.example.sarabentarjem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idCategoritProduit ;
    private String codeProduit ;
    private String libelleCategorieProduit ;

    @OneToMany(mappedBy = "categorieProduit")
    @JsonIgnoreProperties("categorieProduit")
    private Set<Produit> produits ;

}
