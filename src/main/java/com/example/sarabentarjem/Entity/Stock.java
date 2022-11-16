package com.example.sarabentarjem.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private  int idStock ;
    private int qte ;
    private int qteMin ;
    private String libelleStock ;

    @OneToMany(mappedBy = "stock")
    private Set<Produit> produits ;
}
