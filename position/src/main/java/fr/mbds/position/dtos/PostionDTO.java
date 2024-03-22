package fr.mbds.position.dtos;

import fr.mbds.position.models.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostionDTO {
    private Long id;
    private String name;
    private Double averageSalary;
    private List<Long> skillIds; // Ajouté pour transporter les identifiants de compétences
    private List<Skill> skills; // Ajouter pour inclure les compétences réelles
}
