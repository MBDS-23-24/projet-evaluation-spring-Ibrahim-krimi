package fr.mbds.position.mappers;

import fr.mbds.position.dtos.PostionDTO;
import fr.mbds.position.entites.Postion;
import org.springframework.stereotype.Component;

@Component
public class PositionMapper {

    public PostionDTO toDTO(Postion position) {
        // Assurez-vous que la liste des identifiants de compétences est correctement gérée
        return new PostionDTO(position.getId(), position.getName(), position.getAverageSalary(), position.getSkillIds());
    }

    public Postion toEntity(PostionDTO positionDTO) {
        if (positionDTO == null) {
            return null;
        }

        // Utilisation du builder pour une création d'entité plus claire et pour gérer la liste des identifiants de compétences
        Postion position = Postion.builder()
                .id(positionDTO.getId()) // Il est rare de définir l'ID lors de la création d'une entité; assurez-vous que cela est intentionnel
                .name(positionDTO.getName())
                .averageSalary(positionDTO.getAverageSalary())
                .skillIds(positionDTO.getSkillIds()) // Ajout des identifiants de compétences
                .build();

        return position;
    }
}
