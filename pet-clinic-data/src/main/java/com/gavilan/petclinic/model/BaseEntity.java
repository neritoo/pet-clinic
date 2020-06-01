package com.gavilan.petclinic.model;

import java.io.Serializable;

/**
 * @author Ezequiel Gavilán
 */
public abstract class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
