package com.gavilan.petclinic.model;

import java.util.Set;

/** Clase que representa a un dueño, el cual querrá programar visitas para su mascota.
 * @author Ezequiel Gavilán
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
