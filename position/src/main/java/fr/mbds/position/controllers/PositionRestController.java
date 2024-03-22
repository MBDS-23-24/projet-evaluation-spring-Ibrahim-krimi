package fr.mbds.position.controllers;


import fr.mbds.position.dtos.PostionDTO;
import fr.mbds.position.services.IPostionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/positions") // Défini le chemin de base pour ce contrôleur
public class PositionRestController {

    private final IPostionService positionService;

    @Autowired
    public PositionRestController(IPostionService positionService) {
        this.positionService = positionService;
    }

    // Récupère toutes les positions
    @GetMapping
    public ResponseEntity<List<PostionDTO>> findAll() {
        List<PostionDTO> positions = positionService.findAll();
        return ResponseEntity.ok(positions); // Retourne la liste des positions avec un statut 200 OK
    }

    // Récupère une position spécifique par son ID
    @GetMapping("/{id}")
    public ResponseEntity<PostionDTO> findById(@PathVariable Long id) {
        PostionDTO positionDTO = positionService.findById(id);
        if (positionDTO != null) {
            return ResponseEntity.ok(positionDTO); // Retourne la position avec un statut 200 OK
        } else {
            return ResponseEntity.notFound().build(); // Retourne un statut 404 Not Found si la position n'est pas trouvée
        }
    }
}
