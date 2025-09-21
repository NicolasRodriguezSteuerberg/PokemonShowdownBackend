package com.pokemon.showdown.pokemon_service.service.exceptions;

public class PokemonNotFoundException extends RuntimeException {
    public PokemonNotFoundException(String message) {
        super("Pokemon '"+ message +"' not found");
    }
}
