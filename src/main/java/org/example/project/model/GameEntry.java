package org.example.project.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "game_entries")
public class GameEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Game game;

    @Enumerated(EnumType.STRING)
    @NotNull
    private GameStatus status;

    @NotBlank
    @Size(min = 5, max = 100)
    private String notes;

    @NotNull
    @Min(1)
    @Max(100)
    private Integer rating;

    @ManyToOne
    @JoinColumn(name = "collection_id", nullable = false)
    private GameCollection collection;

}
