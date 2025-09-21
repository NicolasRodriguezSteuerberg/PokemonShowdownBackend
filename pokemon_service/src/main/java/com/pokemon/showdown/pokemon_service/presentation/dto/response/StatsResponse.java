package com.pokemon.showdown.pokemon_service.presentation.dto.response;

import lombok.Builder;

@Builder
public record StatsResponse (
        Long hp,
        Long attack,
        Long defense,
        Long specialAttack,
        Long specialDefense,
        Long speed
){
}
