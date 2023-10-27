package com.bw.petclinic.vet.repository;

import com.bw.petclinic.vet.domain.Vet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet, Integer> {

    Page<Vet> findPage(Pageable pageable);

}
