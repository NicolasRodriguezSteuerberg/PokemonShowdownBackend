package com.pokemon.showdown.pokemon_service.service.implementation;

import com.pokemon.showdown.pokemon_service.persistance.entity.TypeEntity;
import com.pokemon.showdown.pokemon_service.persistance.entity.type_effectiveness.TypeEffectivenessEntity;
import com.pokemon.showdown.pokemon_service.persistance.repository.ITypeRepository;
import com.pokemon.showdown.pokemon_service.presentation.dto.response.TypeEffectivenessResponse;
import com.pokemon.showdown.pokemon_service.presentation.dto.response.TypeResponse;
import com.pokemon.showdown.pokemon_service.service.exceptions.type.TypeNotFoundException;
import com.pokemon.showdown.pokemon_service.service.interfaces.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TypeServiceImpl implements ITypeService {

    @Autowired
    private ITypeRepository typeRepository;

    @Override
    public TypeResponse findTypeByName(String name) {
        TypeEntity typeEntity = typeRepository.findTypeEntityByName(name).orElseThrow(() -> new TypeNotFoundException(name));
        return new TypeResponse(
                typeEntity.getName(),
                retrieveTypeEffectivenessResponse(typeEntity.getAttackerEfectiveness(), true),
                retrieveTypeEffectivenessResponse(typeEntity.getDeffenderEfectiveness(), false)
        );
    }

    private List<TypeEffectivenessResponse> retrieveTypeEffectivenessResponse(List<TypeEffectivenessEntity> effectivenessEntities, boolean attack_mode) {
        Map<Float, List<String>> groupedEffectiveness = effectivenessEntities.stream()
                .collect(
                        Collectors.groupingBy(
                                TypeEffectivenessEntity::getMultiplier,
                                Collectors.mapping(
                                        te -> attack_mode? te.getDefend().getName(): te.getAttack().getName(),
                                        Collectors.toList()
                                )
                        )
                );
        return List.of(0.0f, 0.5f, 1.0f, 2.0f).stream()
                .map(m -> new TypeEffectivenessResponse(
                        "x" + m,
                        groupedEffectiveness.getOrDefault(m, List.of())
                ))
                .toList();
    }
}
