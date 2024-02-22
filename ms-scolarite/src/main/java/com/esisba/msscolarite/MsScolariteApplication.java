package com.esisba.msscolarite;

import com.esisba.msscolarite.Proxy.FormationProxy;
import com.esisba.msscolarite.Entities.Etablissement;
import com.esisba.msscolarite.Entities.Etudiant;
import com.esisba.msscolarite.repositories.EtablissementRepository;
import com.esisba.msscolarite.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@EnableFeignClients
@SpringBootApplication
public class MsScolariteApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    EtablissementRepository etablissementRepository;

    @Autowired
    FormationProxy formationProxy;

    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etablissement e1 = etablissementRepository.save(new Etablissement(null, "esi-sba", null));
        Etablissement e2 = etablissementRepository.save(new Etablissement(null, "univ-sba", null));

        etudiantRepository.save(new Etudiant(null, "Mohamed", Date.valueOf("2002-04-27"), "4siw", null, e1 , 1L, null, null));
        etudiantRepository.save(new Etudiant(null, "Nassium", Date.valueOf("2002-05-05"), "4isi", null, e1 , 2L , null, null));
        etudiantRepository.save(new Etudiant(null, "Imad", Date.valueOf("2001-06-27"), "MasterSiC", null, e2 , 2L, null, null));
        etudiantRepository.save(new Etudiant(null, "Ilyes", Date.valueOf("2000-11-16"), "MasterSiR", null, e2 , 1L, null, null));

    }
}
