package com.NinjaWorld.Naruto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NinjaWorld.Naruto.IService.IClanService;
import com.NinjaWorld.Naruto.model.Clan;
import com.NinjaWorld.Naruto.repository.ClanRepository;


@Service
public class ClanService implements IClanService{



	@Autowired
    private ClanRepository cRepository;

    public List<Clan> findAllCharacters() {
        return cRepository.findAll();
    }

    public Clan saveCharacter(Clan clan) {
        return cRepository.save(clan);
    }
}