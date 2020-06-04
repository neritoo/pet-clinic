package com.gavilan.petclinic.model;

/** Clase abstracta que representa una persona con su nombre y apellido.
 * @author Ezequiel Gavilán
 */
public abstract class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    /**
     * Devuelve el nombre de pila de la persona.
     * @return String con el nombre de la persona.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Accede al nombre de pila de la persona para cambiarlo.
     * @param firstName Un nombre de pila en String, el cual reemplazara el ya establecido nombre.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Devuelve el apellido de la persona
     * @return String del apellido de la persona.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Accede al apellido para cambiarlo.
     * @param lastName Un apellido en String que reemplazara al ya seteado.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
