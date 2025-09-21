package com.pokemon.showdown.pokemon_service.presentation.dto.response;

import java.util.Set;

public record PokemonResponse(
        Long id,
        String name,
        String description,
        Set<String> types
) {
}
