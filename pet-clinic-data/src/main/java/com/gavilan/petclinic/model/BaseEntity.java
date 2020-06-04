package com.gavilan.petclinic.model;

import java.io.Serializable;

/** Clase que establece un Id del tipo Long como propiedad, el cual será extendido por todas las clases
 * que requieran de un id para persistir.
 * @author Ezequiel Gavilán
 */
public abstract class BaseEntity implements Serializable {

    private Long id;

    /**
     * Devuelve el id.
     * @return Long con el numero del id actual.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setea el id.
     * @param id Long del numero a setear como id.
     */
    public void setId(Long id) {
        this.id = id;
    }
}
