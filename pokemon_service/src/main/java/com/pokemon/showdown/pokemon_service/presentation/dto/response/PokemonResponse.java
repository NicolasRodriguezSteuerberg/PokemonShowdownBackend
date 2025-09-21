package com.pokemon.showdown.pokemon_service.presentation.dto.response;

import lombok.Builder;

import java.util.Set;

@Builder
public record PokemonResponse(
        Long id,
        String name,
        Long firstGeneration,
        StatsResponse stats,
        Set<String> types
) {
}
