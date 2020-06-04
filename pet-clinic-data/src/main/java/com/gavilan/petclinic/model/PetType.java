package com.gavilan.petclinic.model;

/** Clase que representa los distintos tipos de mascota.
 * @author Ezequiel Gavilán
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
