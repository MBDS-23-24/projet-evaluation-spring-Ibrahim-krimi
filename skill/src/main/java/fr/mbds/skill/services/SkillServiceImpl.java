package fr.mbds.skill.services;

import fr.mbds.skill.dtos.SkillDto;
import fr.mbds.skill.entites.Skill;
import fr.mbds.skill.mappers.SkillMapper;
import fr.mbds.skill.repositories.SkilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SkillServiceImpl implements  ISkillService {
    private final SkilRepository skillRepository;
    private final SkillMapper skillMapper;

    @Autowired
    public SkillServiceImpl(SkilRepository skillRepository, SkillMapper skillMapper) {
        this.skillRepository = skillRepository;
        this.skillMapper = skillMapper;
    }

    @Override
    public List<SkillDto> findAll() {
        return skillRepository.findAll().stream()
                .map(skillMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SkillDto findById(Long id) {
        Optional<Skill> skill = skillRepository.findById(id);
        return skill.map(skillMapper::toDTO).orElse(null);
    }
}