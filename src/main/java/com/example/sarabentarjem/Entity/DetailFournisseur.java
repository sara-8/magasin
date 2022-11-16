package com.example.sarabentarjem.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailFournisseur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Setter(AccessLevel.NONE)
    private int idDetailFournisseur ;
private Date dateDebutCollaboration ;
private String adreese ;
private String matrice  ;

@OneToOne
@JoinColumn(name = "fournisseur_idFournisseur", referencedColumnName = "idFournisseur")
private Fournisseur fournisseur ;


}
