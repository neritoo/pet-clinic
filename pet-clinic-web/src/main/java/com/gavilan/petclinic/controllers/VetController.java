package com.gavilan.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ezequiel Gavilán
 */

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/vets", "/vets/vets.html"})
    public String listVets() {
        return "vets/vets";
    }
}
