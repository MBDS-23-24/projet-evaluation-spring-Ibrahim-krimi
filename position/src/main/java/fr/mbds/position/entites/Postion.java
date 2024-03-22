package fr.mbds.position.entites;


import fr.mbds.position.models.Skill;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Postion {
    @Id
    private Long id;

    private String name ;

    private Double averageSalary;

    @Transient
    private List<Skill> skills;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<Long> skillIds;

}
