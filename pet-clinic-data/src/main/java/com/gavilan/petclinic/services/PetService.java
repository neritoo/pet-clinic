package com.gavilan.petclinic.services;

import com.gavilan.petclinic.model.Pet;

import java.util.Set;

/**
 * @author Ezequiel Gavilán
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
