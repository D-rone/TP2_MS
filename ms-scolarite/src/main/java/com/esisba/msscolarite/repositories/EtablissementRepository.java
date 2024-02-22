package com.esisba.msscolarite.repositories;

import com.esisba.msscolarite.Entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
}
