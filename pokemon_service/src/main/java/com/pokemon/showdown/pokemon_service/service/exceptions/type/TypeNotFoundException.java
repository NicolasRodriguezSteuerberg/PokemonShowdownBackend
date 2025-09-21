package com.pokemon.showdown.pokemon_service.service.exceptions.type;

public class TypeNotFoundException extends RuntimeException {
    public TypeNotFoundException(String message) {
        super("Type '" + message + "' not found");
    }
}
