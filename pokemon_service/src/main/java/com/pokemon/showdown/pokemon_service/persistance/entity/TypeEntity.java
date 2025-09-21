package com.pokemon.showdown.pokemon_service.persistance.entity;

import com.pokemon.showdown.pokemon_service.persistance.entity.pokemon_type.PokemonTypeEntity;
import com.pokemon.showdown.pokemon_service.persistance.entity.type_effectiveness.TypeEffectivenessEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "types")
public class TypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @OneToMany(
            mappedBy = "type"
    )
    private List<PokemonTypeEntity> pokemonsList = new ArrayList<>();

    @OneToMany(
            mappedBy = "attack"
    )
    private List<TypeEffectivenessEntity> attackerEfectiveness = new ArrayList<>();
    @OneToMany(
            mappedBy = "defend"
    )
    private List<TypeEffectivenessEntity> deffenderEfectiveness = new ArrayList<>();
}
