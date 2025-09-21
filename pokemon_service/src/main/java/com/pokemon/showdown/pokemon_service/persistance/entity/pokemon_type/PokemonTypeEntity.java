package com.pokemon.showdown.pokemon_service.persistance.entity.pokemon_type;

import com.pokemon.showdown.pokemon_service.persistance.entity.PokemonEntity;
import com.pokemon.showdown.pokemon_service.persistance.entity.TypeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "pokemon_type")
public class PokemonTypeEntity {
    @EmbeddedId
    private PokemonTypeId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("pokemonId")
    private PokemonEntity pokemon;

    @ManyToOne()
    @MapsId("typeId")
    private TypeEntity type;

    private Integer slot;
}
