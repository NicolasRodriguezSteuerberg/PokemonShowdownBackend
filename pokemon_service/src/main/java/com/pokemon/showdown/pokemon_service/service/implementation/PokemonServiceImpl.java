package com.pokemon.showdown.pokemon_service.service.implementation;

import com.pokemon.showdown.pokemon_service.persistance.entity.PokemonEntity;
import com.pokemon.showdown.pokemon_service.persistance.entity.TypeEntity;
import com.pokemon.showdown.pokemon_service.persistance.entity.pokemon_type.PokemonTypeEntity;
import com.pokemon.showdown.pokemon_service.persistance.repository.IPokemonRepository;
import com.pokemon.showdown.pokemon_service.presentation.dto.response.PokemonResponse;
import com.pokemon.showdown.pokemon_service.service.exceptions.PokemonNotFoundException;
import com.pokemon.showdown.pokemon_service.service.interfaces.IPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements IPokemonService {
    @Autowired
    private IPokemonRepository pokemonRepository;

    @Override
    public PokemonResponse findPokemonByName(String name) {
        PokemonEntity pokemonEntity = pokemonRepository.findPokemonEntityByName(name)
                .orElseThrow(() -> new PokemonNotFoundException(name));
        return new PokemonResponse(
                pokemonEntity.getId(),
                pokemonEntity.getName(),
                pokemonEntity.getDescription(),
                pokemonEntity.getTypesList().stream()
                        .map(PokemonTypeEntity::getType)
                        .map(TypeEntity::getName)
                        .collect(Collectors.toSet())
        );
    }
}
