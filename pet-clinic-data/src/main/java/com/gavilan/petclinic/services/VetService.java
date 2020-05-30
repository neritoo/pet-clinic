package com.gavilan.petclinic.services;

import com.gavilan.petclinic.model.Vet;

import java.util.Set;

/**
 * @author Ezequiel Gavilán
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
