package com.NinjaWorld.Naruto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NinjaWorld.Naruto.IService.IPersonageService;
import com.NinjaWorld.Naruto.model.Personage;



@RestController
@RequestMapping("/api/characters")
@CrossOrigin(origins = "*") 
public class PersonageController {

	@Autowired
    private IPersonageService pService;

    @GetMapping
    public List<Personage> getAllCharacters() {
        return pService.findAllCharacters();
    }
    @GetMapping("/naruto/{id}")
    public Optional<Personage> getCharacterById(@PathVariable Long id) {
        return pService.findCharacterById(id);
    }

    @PostMapping
    public Personage createCharacter(@RequestBody Personage personage) {
        return pService.saveCharacter(personage);
    }
}
