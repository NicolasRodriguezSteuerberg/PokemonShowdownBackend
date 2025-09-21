package com.pokemon.showdown.pokemon_service.presentation.dto.response;

import java.util.List;

public record TypeResponse (
        String name,
        List<TypeEffectivenessResponse> attackToMultipliers,
        List<TypeEffectivenessResponse> attackFromMultipliers
){
}
