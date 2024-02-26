package com.example.revisionspringbiblio.DAO.Repositories;

import com.example.revisionspringbiblio.DAO.Entities.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliothequeRepository extends JpaRepository<Bibliotheque, Long> {
}
