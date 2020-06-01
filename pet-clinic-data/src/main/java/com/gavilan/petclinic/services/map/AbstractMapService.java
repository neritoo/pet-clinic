package com.gavilan.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Clase que simula una base de datos a través de un HashMap, donde guardaremos los valores que querramos guardar en momento
 * de ejeución.
 * @author Ezequiel Gavilán
 */
public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

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
     * @param id id del objeto a guardar.
     * @return el objeto guardado.
     */
    T save(ID id, T object) {
        map.put(id, object);

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

}
