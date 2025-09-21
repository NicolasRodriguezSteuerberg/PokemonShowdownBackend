package com.pokemon.showdown.pokemon_service.persistance.entity.type_effectiveness;

import com.pokemon.showdown.pokemon_service.persistance.entity.pokemon_type.PokemonTypeId;
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
public class TypeEffectivenessId implements Serializable {
    @Column(name = "attack_type_id")
    private Long attackTypeId;
    @Column(name = "defend_type_id")
    private Long defendTypeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeEffectivenessId that = (TypeEffectivenessId) o;
        return Objects.equals(attackTypeId, that.attackTypeId) &&
                Objects.equals(defendTypeId, that.defendTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackTypeId, defendTypeId);
    }

}
