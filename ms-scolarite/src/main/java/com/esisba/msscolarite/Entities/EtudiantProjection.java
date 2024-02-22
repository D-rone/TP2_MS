package com.esisba.msscolarite.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="tof", types=Etudiant.class)
public interface EtudiantProjection {
    String getNom();

    @Value("#{target.etablissement.nom}")
    String getNomEtablissement();

}
