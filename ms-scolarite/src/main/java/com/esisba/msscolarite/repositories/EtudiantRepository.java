package com.esisba.msscolarite.repositories;

import com.esisba.msscolarite.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findEtudiantsByIdFormation(Long idf);
}
