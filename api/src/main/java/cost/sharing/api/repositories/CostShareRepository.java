package cost.sharing.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import cost.sharing.api.entities.CostShare;

public interface CostShareRepository extends JpaRepository<CostShare, UUID>{

}
