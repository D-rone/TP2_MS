package com.esisba.msscolarite.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="tob", types=Etudiant.class)
public interface EtudiantProjectionBourse {
    String getNom();
    String getPromo();
    Date getDateInscription();

    @Value("#{target.etablissement.nom}")
    String getNomEtablissement();

}