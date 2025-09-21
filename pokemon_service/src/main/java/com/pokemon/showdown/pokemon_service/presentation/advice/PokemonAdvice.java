package com.pokemon.showdown.pokemon_service.presentation.advice;

import com.pokemon.showdown.pokemon_service.presentation.dto.ExceptionResponse;
import com.pokemon.showdown.pokemon_service.service.exceptions.PokemonNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class PokemonAdvice {

    @ExceptionHandler(PokemonNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse onPokemonNotFoundException(PokemonNotFoundException exception, HttpServletRequest request) {
        return new ExceptionResponse(
                "Not found",
                exception.getMessage(),
                Instant.now(),
                request.getRequestURI()
        );
    }
}
