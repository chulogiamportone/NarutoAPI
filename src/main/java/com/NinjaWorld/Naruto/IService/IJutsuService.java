package com.NinjaWorld.Naruto.IService;

import java.util.List;

import com.NinjaWorld.Naruto.model.Jutsu;



public interface IJutsuService {

	public List<Jutsu> findAllCharacters();
    public Jutsu saveCharacter(Jutsu jutsu);
}
