package com.pokemon.showdown.pokemon_service.persistance.repository;

import com.pokemon.showdown.pokemon_service.persistance.entity.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPokemonRepository extends JpaRepository<PokemonEntity, Long> {
    Optional<PokemonEntity> findPokemonEntityByName(String name);
}
