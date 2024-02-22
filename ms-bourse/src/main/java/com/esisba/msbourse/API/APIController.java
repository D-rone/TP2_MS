package com.esisba.msbourse.API;

import com.esisba.msbourse.Entities.Etudiant;
import com.esisba.msbourse.Entities.Virement;
import com.esisba.msbourse.Proxy.EtudiantProxy;
import com.esisba.msbourse.Repository.EtudiantRepository;
import com.esisba.msbourse.Repository.VirementRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class APIController {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    VirementRepository virementRepository;

    @Autowired
    EtudiantProxy etudiantProxy;

    @GetMapping("/etudiants/{ide}")
    public Etudiant getEtudiantWithInfo(@PathVariable("ide") Long ide){
        Etudiant etudiant = etudiantRepository.findById(ide).get();

        etudiant.setEtudiantInfo(etudiantProxy.getEtudiantById(ide));

        return etudiant;
    }



}
