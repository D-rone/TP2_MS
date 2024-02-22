package com.esisba.msbourse.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVirement;

    @Column(nullable = false)
    public Float montant;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateVirement;

    private Long idEtudiant;

    @ManyToOne
    Etudiant etudiant;
}
