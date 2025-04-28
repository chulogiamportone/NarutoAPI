package com.NinjaWorld.Naruto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NinjaWorld.Naruto.IService.IJutsuService;
import com.NinjaWorld.Naruto.model.Jutsu;



@RestController
@RequestMapping("/api/characters/jutsu")
@CrossOrigin(origins = "*") 
public class JutsuController {

	@Autowired
    private IJutsuService jService;

    @GetMapping
    public List<Jutsu> getAllCharacters() {
        return jService.findAllCharacters();
    }

    @PostMapping
    public Jutsu createCharacter(@RequestBody Jutsu jutsu) {
        return jService.saveCharacter(jutsu);
    }
}