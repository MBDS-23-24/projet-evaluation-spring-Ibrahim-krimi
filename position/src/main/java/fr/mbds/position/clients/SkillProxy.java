package fr.mbds.position.clients;

import fr.mbds.position.models.Skill;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name = "SKILL") // Remplacez SKILLSERVICE par le nom du service de compétences dans votre architecture
@FeignClient(name = "skill",url = "http://localhost:8888") // Remplacez SKILLSERVICE par le nom du service de compétences dans votre architecture
public interface SkillProxy {

    @GetMapping("/skills/{id}")
    @CircuitBreaker(name = "skillService", fallbackMethod = "getDefaultSkill")
    Skill getSkill(@PathVariable("id") Long id); // L'annotation @PathVariable("id") s'assure que le paramètre de méthode est passé à l'URL
    @GetMapping("/skills")
    @CircuitBreaker(name = "skillService", fallbackMethod = "getDefaultSkills")
    List<Skill> getSkills();

    // Méthode de secours pour getSkill en cas d'échec
    default Skill getDefaultSkill(Long id, Exception exception) {
        return new Skill(id, "Default Skill"); // Retourne une compétence par défaut si le service est indisponible
    }
    // Méthode de secours pour getSkills en cas d'échec
    default List<Skill> getDefaultSkills(Exception exception) {
        return List.of(new Skill(null, "Default Skill")); // Retourne une liste contenant une compétence par défaut
    }
}