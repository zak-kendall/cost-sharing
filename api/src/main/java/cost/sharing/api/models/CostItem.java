package cost.sharing.api.models;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class CostItem {

    private BigDecimal amount;

    private String name;

    private Person paidBy;

    private List<CostShare> shares;
}
