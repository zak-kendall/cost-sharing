package cost.sharing.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import cost.sharing.api.entities.CostItem;

public interface CostItemRepository extends JpaRepository<CostItem, UUID>{

}
