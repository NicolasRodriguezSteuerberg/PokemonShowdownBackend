package com.pokemon.showdown.pokemon_service.service.interfaces;

import com.pokemon.showdown.pokemon_service.presentation.dto.response.TypeResponse;

public interface ITypeService {
    TypeResponse findTypeByName(String name);
}
