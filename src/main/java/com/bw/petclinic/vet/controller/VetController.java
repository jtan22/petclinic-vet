package com.bw.petclinic.vet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VetController {

    private static final Logger LOG = LoggerFactory.getLogger(VetController.class);

    @GetMapping("/")
    public String welcome() {
        LOG.info("GET /");
        return "welcome";
    }
}
