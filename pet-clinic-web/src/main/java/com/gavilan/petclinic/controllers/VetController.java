package com.gavilan.petclinic.controllers;

import com.gavilan.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Clase controladora de los casos de uso:
 *  -Registrar nuevo veterinario.
 *  -Consultar veterinarios.
 *  -Modificar un veterinario.
 *  -Eliminar un veterinario.
 * @author Ezequiel Gavilán
 */

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    /**
     * Se encarga de la peticion Http GET para listar todos los veterinarios registrados en el sistema, y devuelve
     * la vista asociada a dicha lista.
     * @param model Model asociado a la vista.
     * @return String con el nombre html de la vista.
     */
    @RequestMapping({"/vets", "/vets.html" ,"/vets/vets", "/vets/vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", this.vetService.findAll());
        return "vets/vets";
    }
}
