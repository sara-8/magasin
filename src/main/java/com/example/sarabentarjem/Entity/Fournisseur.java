package com.example.sarabentarjem.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idFournisseur ;
    private  String codeFournisseur ;
    private String libelleFournisseur ;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur ;

    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures ;

    @ManyToMany(mappedBy = "fournisseurs")
    private Set<SecteurActivite> secteurActivites ;


    @OneToOne(mappedBy = "fournisseur")
    private DetailFournisseur detailFournisseur ;
}
