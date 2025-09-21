package com.pokemon.showdown.pokemon_service.service.interfaces;

import com.pokemon.showdown.pokemon_service.presentation.dto.response.PokemonResponse;

public interface IPokemonService {
    PokemonResponse findPokemonByName(String name);
}
