package com.gavilan.petclinic.services;

import com.gavilan.petclinic.model.Owner;

import java.util.Set;

/**
 * @author Ezequiel Gavilán
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
