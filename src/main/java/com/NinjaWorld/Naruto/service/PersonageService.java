package com.NinjaWorld.Naruto.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NinjaWorld.Naruto.IService.IPersonageService;
import com.NinjaWorld.Naruto.model.Personage;
import com.NinjaWorld.Naruto.repository.PersonageRepository;



@Service
public class PersonageService implements IPersonageService {

	@Autowired
    private PersonageRepository pRepository;

    public List<Personage> findAllCharacters() {
        return pRepository.findAll();
    }

    public Personage saveCharacter(Personage personage) {
        return pRepository.save(personage);
    }
}
