package com.NinjaWorld.Naruto.IService;

import java.util.List;

import com.NinjaWorld.Naruto.model.Clan;



public interface IClanService {
	public List<Clan> findAllCharacters();
    public Clan saveCharacter(Clan clan);

}

