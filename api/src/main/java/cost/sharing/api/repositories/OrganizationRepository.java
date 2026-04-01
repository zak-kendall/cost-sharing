package cost.sharing.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import cost.sharing.api.entities.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, UUID>{

}
