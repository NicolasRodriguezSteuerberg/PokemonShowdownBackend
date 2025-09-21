package com.pokemon.showdown.pokemon_service.persistance.entity.type_effectiveness;

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
@Table(name = "type_effectiveness")
public class TypeEffectivenessEntity {
    @EmbeddedId
    private TypeEffectivenessId id;

    @ManyToOne()
    @MapsId("attackTypeId")
    private TypeEntity attack;

    @ManyToOne()
    @MapsId("defendTypeId")
    private TypeEntity defend;

    private Float multiplier;
}
