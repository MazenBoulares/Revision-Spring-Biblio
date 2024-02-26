package com.example.revisionspringbiblio.DAO.Entities;


import DAO.Entities.Types.Etat;
import DAO.Entities.Types.Role;
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
@Table(name="Utilisateur")
public class Utilisateur {

    @Id
    @Column(name="idUtulisateur")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idUser;

    private String nom;

    private String prenom;

    private String nationalite;

    private Role role;

    private Date dateDebutAbonnement;

    private Date dateFinAbonnement;

    private Etat etat;


    //livre ecrit par auteur
    @OneToMany(mappedBy = "auteur")
    List<Livre> livresEcrits;


    @OneToOne(mappedBy="lecteur")
    private Livre livreLu;





}