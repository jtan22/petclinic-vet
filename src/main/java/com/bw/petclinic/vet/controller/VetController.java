package com.bw.petclinic.vet.controller;

import com.bw.petclinic.vet.domain.PagedVets;
import com.bw.petclinic.vet.domain.Vet;
import com.bw.petclinic.vet.repository.VetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VetController {

    private static final Logger LOG = LoggerFactory.getLogger(VetController.class);

    private final VetRepository vetRepository;

    @Autowired
    public VetController(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    /**
     * Health check.
     *
     * @return
     */
    @GetMapping("/")
    public String welcome() {
        LOG.info("GET /");
        return "welcome";
    }

    /**
     * Get a Page of Vets by pageNumber and pageSize.
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @GetMapping("/vets")
    public PagedVets getVets(@RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize) {
        LOG.info("GET /vets with pageNumber [" + pageNumber + "], pageSize [" + pageSize + "]");
        Page<Vet> vets = vetRepository.findAll(PageRequest.of(pageNumber, pageSize));
        return new PagedVets(vets.getContent(), pageNumber, pageSize, vets.getTotalPages(), vets.getTotalElements());
    }
}
