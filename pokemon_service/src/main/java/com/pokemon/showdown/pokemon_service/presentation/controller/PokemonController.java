package com.pokemon.showdown.pokemon_service.presentation.controller;

import com.pokemon.showdown.pokemon_service.presentation.dto.response.PokemonResponse;
import com.pokemon.showdown.pokemon_service.service.implementation.PokemonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pokemon")
public class PokemonController {

    @Autowired
    private PokemonServiceImpl pokemonService;

    @GetMapping("/{name}")
    @ResponseStatus(value = HttpStatus.OK)
    public PokemonResponse getPokemonByName(@PathVariable String name) {
        return pokemonService.findPokemonByName(name);
    }
}
