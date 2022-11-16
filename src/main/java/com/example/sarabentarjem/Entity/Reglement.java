package com.example.sarabentarjem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
   private int idReglement ;
    private float montantPaye ;
    private float montantRestant ;
    private Date dateReglement ;


    @ManyToOne
    private Facture facture ;
}
