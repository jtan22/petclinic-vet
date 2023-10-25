package com.bw.petclinic.vet.repository;

import com.bw.petclinic.vet.domain.Vet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends PagingAndSortingRepository<Vet, Integer>, CrudRepository<Vet, Integer> {

    Page<Vet> findAll(Pageable pageable);

}
