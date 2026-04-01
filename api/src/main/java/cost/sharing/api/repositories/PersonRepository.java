package cost.sharing.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import cost.sharing.api.entities.Person;

public interface PersonRepository extends JpaRepository<Person, UUID>{

}
