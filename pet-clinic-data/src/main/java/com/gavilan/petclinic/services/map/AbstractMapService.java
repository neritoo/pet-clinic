package com.gavilan.petclinic.services.map;

import com.gavilan.petclinic.model.BaseEntity;

import java.util.*;

/**
 * Clase que simula una base de datos a través de un HashMap, donde guardaremos los valores que querramos guardar en momento
 * de ejeución.
 * @author Ezequiel Gavilán
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    /**
     * Retorna todos los objetos guardados en el HashMap.
     * @return un Set con los objetos del map.
     */
    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    /**
     * Regresa un único objeto en el HashMap, buscado por un id.
     * @param id valor identificador del objeto a buscar.
     * @return el objeto de id buscado.
     */
    T findById(ID id) {
        return map.get(id);
    }

    /**
     * Guarda el objeto solicitado en el HashMap y retorna el mismo.
     * @param object objeto a guardar.
     * @return el objeto guardado.
     */
    T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(this.getNextId());
            }

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    /**
     * Elimina un objeto en el HashMap a través del id recibido como parámetro.
     * @param id id del objeto a eliminar.
     */
    void deleteById(ID id) {
        map.remove(id);
    }

    /**
     * Elimina un objeto en el HashMap, que es pasado como parámetro.
     * @param object objeto a eliminar.
     */
    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    /**
     * Generar ids automaticamente para guardar objetos en el HashMap con id unico.
     * @return Long del numero de id unico.
     */
    private Long getNextId() {
        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }
}
