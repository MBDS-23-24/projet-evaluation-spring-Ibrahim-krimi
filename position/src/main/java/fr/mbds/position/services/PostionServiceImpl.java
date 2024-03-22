package fr.mbds.position.services;

import fr.mbds.position.dtos.PostionDTO;
import fr.mbds.position.entites.Postion;
import fr.mbds.position.mappers.PositionMapper;
import fr.mbds.position.repositories.PostionRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostionServiceImpl implements IPostionService {

    private final PostionRepositories positionRepository;
    private final PositionMapper positionMapper;

    public PostionServiceImpl(PostionRepositories positionRepository, PositionMapper positionMapper) {
        this.positionRepository = positionRepository;
        this.positionMapper = positionMapper;
    }


    @Override
    public List<PostionDTO> findAll() {
        // Utilisez le repository pour récupérer toutes les positions, puis convertissez-les en DTOs
        return positionRepository.findAll().stream()
                .map(positionMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PostionDTO findById(Long id) {
        // Utilisez le repository pour trouver une position par son ID, convertissez-la en DTO si présente
        Optional<Postion> position = positionRepository.findById(id);
        return position.map(positionMapper::toDTO).orElse(null);
    }
}