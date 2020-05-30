package com.gavilan.petclinic.model;

/**
 * @author Ezequiel Gavilán
 */
public abstract class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
