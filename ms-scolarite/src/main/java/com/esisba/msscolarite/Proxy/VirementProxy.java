package com.esisba.msscolarite.Proxy;

import com.esisba.msscolarite.Model.Formation;
import com.esisba.msscolarite.Model.Virement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-bourse" , url = "localhost:8083" )
public interface VirementProxy {

    @GetMapping("/virements/search/findVirementsByIdEtudiant")
    CollectionModel<Virement> getVirements(@RequestParam("ide") Long ide, @RequestParam("projection") String p);

}
