package com.NinjaWorld.Naruto.IService;

import java.util.List;

import com.NinjaWorld.Naruto.model.Personage;



public interface IPersonageService {

	public List<Personage> findAllCharacters();
    public Personage saveCharacter(Personage personage);

}
