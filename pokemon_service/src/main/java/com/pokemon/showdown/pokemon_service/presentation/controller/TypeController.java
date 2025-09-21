package com.pokemon.showdown.pokemon_service.presentation.controller;

import com.pokemon.showdown.pokemon_service.presentation.dto.response.TypeResponse;
import com.pokemon.showdown.pokemon_service.service.implementation.TypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/type")
public class TypeController {
    @Autowired
    private TypeServiceImpl typeService;

    @GetMapping("/{name}")
    @ResponseStatus(value = HttpStatus.OK)
    public TypeResponse getTypeByName(@PathVariable String name) {
        return typeService.findTypeByName(name);
    }
}
