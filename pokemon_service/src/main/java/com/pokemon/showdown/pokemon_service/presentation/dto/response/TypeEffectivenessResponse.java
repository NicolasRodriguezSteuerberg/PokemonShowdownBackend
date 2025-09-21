package com.pokemon.showdown.pokemon_service.presentation.dto.response;


import java.util.List;

public record TypeEffectivenessResponse(
        String multiplier,
        List<String> types
){
}
