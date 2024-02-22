package com.esisba.msbourse.Repository;

import com.esisba.msbourse.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    List<Etudiant> getEtudiantsByIdEtudiant(Long ide);

}
