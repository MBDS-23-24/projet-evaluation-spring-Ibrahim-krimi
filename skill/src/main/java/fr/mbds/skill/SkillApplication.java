package fr.mbds.skill;

import fr.mbds.skill.entites.Skill;
import fr.mbds.skill.repositories.SkilRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SkillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(SkilRepository skillRepository) {
        return args -> {
            Skill skill1 = new Skill(null, "Java");
            Skill skill2 = new Skill(null, "Spring Boot");
            // Ajoutez d'autres compétences au besoin

            skillRepository.save(skill1);
            skillRepository.save(skill2);
            // Sauvegardez d'autres entités au besoin
        };
    }

}
