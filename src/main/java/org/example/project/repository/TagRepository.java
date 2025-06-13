package org.example.project.repository;

import org.example.project.model.Game;
import org.example.project.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByName(String name);

    Set<Tag> findByGame(Set<Game> game);


}
