package com.esisba.msbourse.Repository;

import com.esisba.msbourse.Entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VirementRepository extends JpaRepository<Virement, Long> {

    List<Virement> findVirementsByIdEtudiant(Long ide);

}
