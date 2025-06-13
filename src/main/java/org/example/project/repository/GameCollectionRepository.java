package org.example.project.repository;


import org.example.project.model.GameCollection;
import org.example.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameCollectionRepository extends JpaRepository<GameCollection, Long> {

    List<GameCollection> findByUser(User user);
}
