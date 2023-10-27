package com.bw.petclinic.vet.repository;

import com.bw.petclinic.vet.domain.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "veterinarians")
public interface VetRepository extends JpaRepository<Vet, Integer> {

}
