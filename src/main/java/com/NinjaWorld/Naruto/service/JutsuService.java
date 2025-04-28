package com.NinjaWorld.Naruto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NinjaWorld.Naruto.IService.IJutsuService;
import com.NinjaWorld.Naruto.model.Jutsu;
import com.NinjaWorld.Naruto.repository.JutsuRepository;



@Service
public class JutsuService implements IJutsuService{

	@Autowired
    private JutsuRepository jRepository;

    public List<Jutsu> findAllCharacters() {
        return jRepository.findAll();
    }

    public Jutsu saveCharacter(Jutsu jutsu) {
        return jRepository.save(jutsu);
    }
}