package cost.sharing.api.entities;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private Set<Organization> ownedOrganizations = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "person_organization", 
        joinColumns = @JoinColumn(name = "person_id"), 
        inverseJoinColumns = @JoinColumn(name = "organization_id")
    )
    private Set<Organization> organizations = new HashSet<>();

}
