package com.NinjaWorld.Naruto.IService;

import java.util.List;
import java.util.Optional;

import com.NinjaWorld.Naruto.model.Personage;



public interface IPersonageService {

	public List<Personage> findAllCharacters();
    public Personage saveCharacter(Personage personage);
	public Optional<Personage> findCharacterById(Long id);

}
