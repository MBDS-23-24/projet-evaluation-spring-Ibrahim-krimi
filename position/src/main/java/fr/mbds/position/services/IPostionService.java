package fr.mbds.position.services;

import fr.mbds.position.dtos.PostionDTO;

import java.util.List;

public interface IPostionService {
    List<PostionDTO> findAll();
    PostionDTO findById(Long id);
    PostionDTO  getPositionByIdWithSkills(Long id);
    List<PostionDTO>   getAllPositionsWithSkills();
}
