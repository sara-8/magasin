package com.example.sarabentarjem.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idOperateur;
    private String nom ;
    private String prenom ;
    private String password ;

    @OneToMany
    private Set<Facture> factures ;
}
