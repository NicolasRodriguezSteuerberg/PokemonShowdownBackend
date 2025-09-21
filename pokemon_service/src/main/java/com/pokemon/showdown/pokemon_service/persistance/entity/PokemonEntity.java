package com.pokemon.showdown.pokemon_service.persistance.entity;

import com.pokemon.showdown.pokemon_service.persistance.entity.pokemon_type.PokemonTypeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "pokemon")
@Entity
public class PokemonEntity {
    @Id
    private Long id;
    private String name;
    private String description;
    @OneToMany(
            mappedBy = "pokemon",
            fetch = FetchType.EAGER
    )
    private List<PokemonTypeEntity> typesList = new ArrayList<>();
}
