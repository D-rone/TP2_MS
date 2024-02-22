package com.esisba.msbourse.Entities;

import com.esisba.msbourse.Model.EtudiantModal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    @Column(nullable = false)
    public Long nCompteCCP;
    public Float SalaireParent;
    public Boolean SituationImpot;

    @OneToMany
    private Collection<Virement> virements;

    @Transient
    private EtudiantModal etudiantInfo;
}
