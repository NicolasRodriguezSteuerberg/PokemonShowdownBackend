package com.pokemon.showdown.pokemon_service.presentation.dto;

import java.time.Instant;

public record ExceptionResponse(
        String error,
        String message,
        Instant timestamp,
        String path
) {
}
