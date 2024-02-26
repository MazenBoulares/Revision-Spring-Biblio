package com.example.revisionspringbiblio.DAO.Entities;

import DAO.Entities.Types.Etat;
import DAO.Entities.Types.Role;
import DAO.Entities.Types.TypeLivre;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Livre")
public class Livre {

    @Id
    @Column(name="idLivre")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idLivre;

    private String nom;

    private TypeLivre type;

    private Date dateEmission;

    private Boolean reserve;

    private Date dateReservation;



    //parent
    //auteur
    @ManyToOne
    private Utilisateur auteur;


    @OneToOne
    private Utilisateur lecteur;

}
