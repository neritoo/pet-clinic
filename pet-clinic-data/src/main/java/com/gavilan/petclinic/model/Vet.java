package com.gavilan.petclinic.model;

import java.util.Set;

/** Clase que representa un veterinario, el cual atenderá visitas.
 * @author Ezequiel Gavilán
 */
public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
