package com.gavilan.petclinic.model;

import java.time.LocalDate;

/** Clase que representa una mascota, la cual sera parte de visitas segun su dueño las pida y programe.
 * @author Ezequiel Gavilán
 */
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
