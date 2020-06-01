package com.gavilan.petclinic.services;

import com.gavilan.petclinic.model.Owner;

/**
 * @author Ezequiel Gavilán
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
