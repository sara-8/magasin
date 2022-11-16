package com.example.sarabentarjem.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idProduit ;

    private String codeProduit ;
    private String libelleProduit ;
    private float prix ;
    private Date dateCreation ;
    private Date dateDerniereModification  ;

    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactures ;
    @ManyToOne
    private Stock stock ;

    @ManyToOne
    private CategorieProduit categorieProduit;
}
