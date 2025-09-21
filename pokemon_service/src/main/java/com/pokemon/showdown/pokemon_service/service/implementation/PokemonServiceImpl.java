package com.pokemon.showdown.pokemon_service.service.implementation;

import com.pokemon.showdown.pokemon_service.persistance.entity.PokemonEntity;
import com.pokemon.showdown.pokemon_service.persistance.entity.TypeEntity;
import com.pokemon.showdown.pokemon_service.persistance.entity.pokemon_type.PokemonTypeEntity;
import com.pokemon.showdown.pokemon_service.persistance.repository.IPokemonRepository;
import com.pokemon.showdown.pokemon_service.presentation.dto.response.PokemonResponse;
import com.pokemon.showdown.pokemon_service.presentation.dto.response.StatsResponse;
import com.pokemon.showdown.pokemon_service.service.exceptions.PokemonNotFoundException;
import com.pokemon.showdown.pokemon_service.service.interfaces.IPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements IPokemonService {
    @Autowired
    private IPokemonRepository pokemonRepository;

    @Override
    public PokemonResponse findPokemonByName(String name) {
        PokemonEntity pokemonEntity = pokemonRepository.findPokemonEntityByName(name)
                .orElseThrow(() -> new PokemonNotFoundException(name));

        return PokemonResponse.builder()
                .id(pokemonEntity.getId())
                .name(pokemonEntity.getName())
                .firstGeneration(pokemonEntity.getGeneration())
                .stats(getStats(pokemonEntity))
                .types(getTypes(pokemonEntity))
                .build();
    }

    private StatsResponse getStats(PokemonEntity pokemon) {
        return StatsResponse.builder()
                .hp(pokemon.getHp())
                .attack(pokemon.getAttack())
                .defense(pokemon.getDefense())
                .specialAttack(pokemon.getSpecial_attack())
                .specialDefense(pokemon.getSpecial_defense())
                .speed(pokemon.getSpeed())
                .build();
    }

    private Set<String> getTypes(PokemonEntity pokemon) {
        return pokemon.getTypesList().stream()
                .map(PokemonTypeEntity::getType)
                .map(TypeEntity::getName)
                .collect(Collectors.toSet());
    }
}
