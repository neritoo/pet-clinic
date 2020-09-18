package com.gavilan.petclinic.model;

/**
 * Clase que representa una especialidad de un veterinario.
 */

public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
