package com.esisba.msformation.API;

import com.esisba.msformation.Proxy.EtudiantProxy;
import com.esisba.msformation.entities.Formation;
import com.esisba.msformation.repository.FormationRepository;
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
    FormationRepository formationRepository;
    @Resource
    EtudiantProxy etudiantProxy;

    @GetMapping("/formations/{idf}")
    public Formation getFormation(@PathVariable("idf") Long idf)
    {
        Formation formation = formationRepository.findById(idf).get();

        formation.setEtudiants(
                new ArrayList<>(etudiantProxy.getEtudiants(idf, "tof").getContent())
        );

        return formation;
    }

}
