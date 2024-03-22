package fr.mbds.skill.controllers;

import fr.mbds.skill.dtos.SkillDto;
import fr.mbds.skill.services.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skills") // Définit le chemin de base pour les endpoints de ce contrôleur
public class SkillRestController {

    private final ISkillService skillService;

    @Autowired
    public SkillRestController(ISkillService skillService) {
        this.skillService = skillService;
    }

    // Endpoint pour récupérer toutes les compétences
    @GetMapping
    public ResponseEntity<List<SkillDto>> findAll() {
        List<SkillDto> skills = skillService.findAll();
        return ResponseEntity.ok(skills); // Retourne la liste des compétences avec un statut 200 OK
    }

    // Endpoint pour trouver une compétence par son ID
    @GetMapping("/{id}")
    public ResponseEntity<SkillDto> findById(@PathVariable Long id) {
        SkillDto skillDTO = skillService.findById(id);
        if (skillDTO != null) {
            return ResponseEntity.ok(skillDTO); // Retourne la compétence avec un statut 200 OK
        } else {
            return ResponseEntity.notFound().build(); // Retourne un statut 404 Not Found si la compétence n'est pas trouvée
        }
    }
}