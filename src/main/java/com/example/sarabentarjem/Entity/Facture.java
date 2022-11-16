package com.example.sarabentarjem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Setter(AccessLevel.NONE)
        private int idFacture ;
        private float montantRemise ;
        private float montantFacture ;
        private Date dateCreationFacture ;
        private Date dateDerniereModification ;
        private boolean archive ;

        @OneToMany(mappedBy = "facture")
        @JsonIgnoreProperties("facture")
        private Set<Reglement> reglements ;

        @OneToMany(mappedBy = "facture")
        @JsonIgnoreProperties("detailFactures")
        private Set<DetailFacture> detailFactures ;

        @ManyToOne
        private Fournisseur fournisseur ;


}
