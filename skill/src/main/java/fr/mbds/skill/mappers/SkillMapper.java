package fr.mbds.skill.mappers;


import fr.mbds.skill.dtos.SkillDto;
import fr.mbds.skill.entites.Skill;
import org.springframework.stereotype.Component;

@Component
public class SkillMapper {

    public SkillDto toDTO(Skill skill) {
        if (skill == null) {
            return null;
        }

        SkillDto dto = new SkillDto();
        dto.setId(skill.getId());
        dto.setName(skill.getName());
        return dto;
    }

    public Skill toEntity(SkillDto skillDTO) {
        if (skillDTO == null) {
            return null;
        }

        Skill skill = new Skill();
        skill.setId(null); // Faites attention à la gestion des ID lors de la création d'une nouvelle entité
        skill.setName(skillDTO.getName());
        return skill;
    }
}
