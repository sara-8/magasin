package com.example.sarabentarjem.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int  idDetailFacture ;
    private int qteCommande ;
    private float prixtotalDetail ;
    private int pourcentageRemise ;
    private float montantRemise ;

    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Produit produit;

}
