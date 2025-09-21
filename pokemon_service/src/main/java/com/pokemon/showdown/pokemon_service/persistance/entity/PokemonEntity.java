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
    @Column(unique = true)
    private String name;
    private Long generation;
    private Long hp;
    private Long attack;
    private Long defense;
    private Long special_attack;
    private Long special_defense;
    private Long speed;
    @OneToMany(
            mappedBy = "pokemon",
            fetch = FetchType.EAGER
    )
    private List<PokemonTypeEntity> typesList = new ArrayList<>();
}
