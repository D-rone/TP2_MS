package com.esisba.msbourse.Proxy;

import com.esisba.msbourse.Model.EtudiantModal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-scolarite" , url = "localhost:8082")
public interface EtudiantProxy {

    @GetMapping("/etudiants/{id}")
    public EtudiantModal getEtudiantById(@PathVariable("id") Long id);

}
