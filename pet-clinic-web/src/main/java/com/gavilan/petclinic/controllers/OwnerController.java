package com.gavilan.petclinic.controllers;

import com.gavilan.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/** Clase controladora de los casos de uso:
 *  -Registrar nuevo dueño.
 *  -Consultar dueños.
 *  -Modificar un dueño.
 *  -Eliminar un dueño.
 * @author Ezequiel Gavilán
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    /**
     * Se encarga de la peticion Http GET para listar todos los dueños registrados en el sistema, y devuelve
     * la vista asociada a dicha lista.
     * @param model Model asociado a la vista.
     * @return String con el nombre html de la vista.
     */
    @RequestMapping({"", "/owners", "/owners.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", this.ownerService.findAll());
        return "owners/owners";
    }
}
