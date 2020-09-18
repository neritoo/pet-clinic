package com.gavilan.petclinic.model;

import java.util.Set;

/** Clase que representa a un dueño, el cual querrá programar visitas para su mascota.
 * @author Ezequiel Gavilán
 */
public class Owner extends Person {

    private String adress;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
