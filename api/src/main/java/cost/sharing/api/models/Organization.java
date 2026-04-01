package cost.sharing.api.models;

import java.util.List;

import lombok.Data;

@Data
public class Organization {

    private Person owner;

    private String name;

    private List<CostItem> costItems;

    private List<Person> members;
}
