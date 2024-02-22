package com.esisba.msbourse.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "tos" , types = Virement.class)
public interface VirementProjection {
    Long getIdVirement();
    Date getDateVirement();

    @Value("#{target.etudiant.nCompteCCP}")
    Float getNCompteCCP();
}
