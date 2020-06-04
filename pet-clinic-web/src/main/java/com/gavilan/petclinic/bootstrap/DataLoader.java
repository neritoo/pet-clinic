package com.gavilan.petclinic.bootstrap;

import com.gavilan.petclinic.model.Owner;
import com.gavilan.petclinic.model.Vet;
import com.gavilan.petclinic.services.OwnerService;
import com.gavilan.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Clase que carga datos en nuestro servicio de persistencia al inicio del programa.
 * @author Ezequiel Gavilán
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    /**
     * Constructor donde inyectamos los nuestros servicios de owner y vet.
     * En nuestra primer implementación, utilizaremos el servicio de ambos con un HashMap.
     * @param ownerService Servicio del owner.
     * @param vetService Servicio del vet.
     */
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        // Creamos dos objetos owners y los guardamos con nuestro ownerService. En la primer implementación,
        // el ownerService será implementado por OwnerServiceMap, persistiendo los objetos en un HashMap en memoria.
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        this.ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        this.ownerService.save(owner2);

        System.out.println("Owners loaded...");

        // Creamos dos vets...

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        this.vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        this.vetService.save(vet2);

        System.out.println("Vets loaded...");

    }
}
