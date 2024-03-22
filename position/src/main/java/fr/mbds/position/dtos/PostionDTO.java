package fr.mbds.position.dtos;

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
}
