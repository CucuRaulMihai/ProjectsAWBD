package org.example.project.repository;

import org.example.project.model.Game;
import org.example.project.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    List<Game> findByTitleIgnoreCase(String title);

    List<Game> findByPublisherIgnoreCase(String publisher);

}
