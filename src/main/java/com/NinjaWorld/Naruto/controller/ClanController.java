package com.NinjaWorld.Naruto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NinjaWorld.Naruto.IService.IClanService;
import com.NinjaWorld.Naruto.model.Clan;




@RestController
@RequestMapping("/api/characters/clan")
public class ClanController {


	@Autowired
    private IClanService cService;

    @GetMapping
    public List<Clan> getAllCharacters() {
        return cService.findAllCharacters();
    }

    @PostMapping
    public Clan createCharacter(@RequestBody Clan clan) {
        return cService.saveCharacter(clan);
    }
}