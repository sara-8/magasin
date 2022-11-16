package com.example.sarabentarjem.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idSecteurActivite ;
    private String codeSecteurActivite ;
    private String libelleSecteurActivite ;

    @ManyToMany
    private Set<Fournisseur> fournisseurs ;


}
