package com.pokemon.showdown.pokemon_service.persistance.repository;

import com.pokemon.showdown.pokemon_service.persistance.entity.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ITypeRepository extends JpaRepository<TypeEntity, Long> {
    Optional<TypeEntity> findTypeEntityByName(String name);
}
