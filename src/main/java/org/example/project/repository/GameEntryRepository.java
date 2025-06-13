package org.example.project.repository;


import org.example.project.model.GameEntry;
import org.example.project.model.GameStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameEntryRepository extends JpaRepository<GameEntry, Long> {

    List<GameEntry> findByStatus(GameStatus status);
}
