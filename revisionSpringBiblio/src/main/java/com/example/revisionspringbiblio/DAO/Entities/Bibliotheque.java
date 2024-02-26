
package com.example.revisionspringbiblio.DAO.Entities;
import DAO.Entities.Types.Etat;
import DAO.Entities.Types.Role;
import DAO.Entities.Types.TypeLivre;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Bibliotheque")

public class Bibliotheque {

    @Id
    @Column(name="idBiblio")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idBiblio;

    private String nom;

    private String adresse;

    private long telephone;

@OneToMany
    private List<Livre> livres;


}
