package com.esisba.msscolarite.API;

import com.esisba.msscolarite.Proxy.FormationProxy;
import com.esisba.msscolarite.Entities.Etudiant;
import com.esisba.msscolarite.Proxy.VirementProxy;
import com.esisba.msscolarite.repositories.EtudiantRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class APIController {

    @Resource
    EtudiantRepository etudiantRepository;

    @Resource
    FormationProxy formationProxy;

    @GetMapping("/etudiantsWithFormation/{ide}")
    public Etudiant getEtudiantWithFormation(@PathVariable("ide") Long ide)
    {
        Etudiant etudiant = etudiantRepository.findById(ide).get();

        Long idFormation = etudiant.getIdFormation();
        etudiant.setFormation(formationProxy.getFormationById(idFormation));

        return  etudiant;
    }

    @Resource
    VirementProxy virementProxy;

    @GetMapping("/etudiantWithVirement/{ide}")
    public Etudiant getEtudiantWithVirement(@PathVariable("ide") Long ide)
    {
        Etudiant etudiant = etudiantRepository.findById(ide).get();

        etudiant.setVirements(
                new ArrayList<>(virementProxy.getVirements(ide, "tos").getContent())
        );

        return etudiant;
    }

}
