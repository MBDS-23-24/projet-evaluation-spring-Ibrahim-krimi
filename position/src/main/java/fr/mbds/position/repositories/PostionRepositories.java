package fr.mbds.position.repositories;

import fr.mbds.position.entites.Postion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostionRepositories  extends JpaRepository<Postion, Long> {

}
