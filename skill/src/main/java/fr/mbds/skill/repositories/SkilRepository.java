package fr.mbds.skill.repositories;

import fr.mbds.skill.entites.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkilRepository extends JpaRepository<Skill, Long> {
}
