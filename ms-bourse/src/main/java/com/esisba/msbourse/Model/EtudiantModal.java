package com.esisba.msbourse.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class EtudiantModal {
    private String nom;
    private String promo;
    private Date dateInscription;
    private String nomEtablissement;
}
