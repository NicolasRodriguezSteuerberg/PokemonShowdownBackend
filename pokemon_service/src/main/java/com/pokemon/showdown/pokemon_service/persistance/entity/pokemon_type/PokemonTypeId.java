package com.pokemon.showdown.pokemon_service.persistance.entity.pokemon_type;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class PokemonTypeId implements Serializable {
    @Column(name = "pokemon_id")
    private Long pokemonId;
    @Column(name = "type_id")
    private Long typeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PokemonTypeId that = (PokemonTypeId) o;
        return Objects.equals(pokemonId, that.pokemonId) &&
                Objects.equals(typeId, that.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemonId, typeId);
    }

}
