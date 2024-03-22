package fr.mbds.position;

import fr.mbds.position.entites.Postion;
import fr.mbds.position.repositories.PostionRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableFeignClients  // Ajoutez cette annotation
public class PositionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PositionApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PostionRepositories positionRepository) {
        return args -> {
            // Assigner manuellement les IDs
            Postion position1 = new Postion(1L, "Développeur Java", 50000.0, null, List.of(1L, 2L)); // Supposons que les compétences avec ID 1 et 2 existent déjà
            Postion position2 = new Postion(2L, "Architecte logiciel", 70000.0, null, List.of(2L, 3L)); // Supposons que les compétences avec ID 2 et 3 existent déjà

            positionRepository.save(position1);
            positionRepository.save(position2);
            // Sauvegardez d'autres entités au besoin
        };
    }


}
