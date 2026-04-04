package cost.sharing.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cost.sharing.api.entities.Organization;
import cost.sharing.api.entities.Person;
import cost.sharing.api.repositories.OrganizationRepository;
import cost.sharing.api.repositories.PersonRepository;



@RestController
@RequestMapping("/data")
public class DataController {
    private final OrganizationRepository organizationRepository;
    private final PersonRepository personRepository;

    public DataController(PersonRepository personRepository, OrganizationRepository organizationRepository) {
        this.personRepository = personRepository;
        this.organizationRepository = organizationRepository;
        
    }

    @GetMapping("/pw")
    public ResponseEntity<Organization> getHello() {
        return ResponseEntity.ok(organizationRepository.findAll().get(0));
    }
    
    @PostMapping("/seed")
    public void  seed() {
        Person zak = new Person();
        zak.setName("Zak");
        personRepository.save(zak);

        Person zy = new Person();
        zy.setName("Zy");
        personRepository.save(zy);

        Person taven = new Person();
        taven.setName("Taven");
        personRepository.save(taven);

        Person mikey = new Person();
        mikey.setName("Mikey");
        personRepository.save(mikey);

        Person dylan = new Person();
        dylan.setName("Dylan");
        personRepository.save(dylan);

        Person jayden = new Person();
        jayden.setName("Jayden");
        personRepository.save(jayden);

        Person zeke = new Person();
        zeke.setName("Zeke");
        personRepository.save(zeke);

        Person maysen = new Person();
        maysen.setName("Maysen");
        personRepository.save(maysen);

        Organization prestigeWorldWide = new Organization();
        prestigeWorldWide.setName("Prestige Worldwide");

        prestigeWorldWide.getMembers().add(maysen);
        prestigeWorldWide.getMembers().add(zy);
        prestigeWorldWide.getMembers().add(zak);
        prestigeWorldWide.getMembers().add(taven);
        prestigeWorldWide.getMembers().add(mikey);
        prestigeWorldWide.getMembers().add(dylan);
        prestigeWorldWide.getMembers().add(zeke);
        prestigeWorldWide.getMembers().add(jayden);

        Person thomas = new Person();
        thomas.setName("Thomas");
        personRepository.save(thomas);

        prestigeWorldWide.setOwner(thomas);
        organizationRepository.save(prestigeWorldWide);
    }
    
}
