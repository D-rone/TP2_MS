package com.esisba.msbourse;

import com.esisba.msbourse.Entities.Etudiant;
import com.esisba.msbourse.Entities.Virement;
import com.esisba.msbourse.Repository.EtudiantRepository;
import com.esisba.msbourse.Repository.VirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class MsBourseApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    VirementRepository virementRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsBourseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Etudiant e1 = etudiantRepository.save(new Etudiant(1L,  234L , 200000F , false , null , null));
        Etudiant e2 = etudiantRepository.save(new Etudiant(2L,  567L , 50000F , false, null , null));
        Etudiant e3 = etudiantRepository.save(new Etudiant(3L,  436L , 100000F , true , null , null));
        Etudiant e4 = etudiantRepository.save(new Etudiant(4L,  855L , 80000F , false , null , null));

        Virement v1 = virementRepository.save(new Virement(null , 3000F , new Date() , 1L , e1));
        Virement v2 = virementRepository.save(new Virement(null , 9000F , new Date() , 2L ,e2));
        Virement v3 = virementRepository.save(new Virement(null , 5000F , new Date() , 3L ,e3));
        Virement v4 = virementRepository.save(new Virement(null , 7000F , new Date() , 4L ,e4));
        Virement v5 = virementRepository.save(new Virement(null , 25000F , new Date() , 1L ,e1));
        Virement v6 = virementRepository.save(new Virement(null , 33000F , new Date() , 2L ,e2));

    }
}
