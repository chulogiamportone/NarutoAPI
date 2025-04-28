package com.NinjaWorld.Naruto.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NinjaWorld.Naruto.IService.IPersonageService;
import com.NinjaWorld.Naruto.model.Personage;
import com.NinjaWorld.Naruto.repository.PersonageRepository;



@Service
public class PersonageService implements IPersonageService {

	@Autowired
    private PersonageRepository pRepository;
	
	@Override
    public List<Personage> findAllCharacters() {
        return pRepository.findAll();
    }
    @Override
    public Personage saveCharacter(Personage personage) {
        return pRepository.save(personage);
    }
    

	@Override
	public Optional<Personage> findCharacterById(Long id) {
		return pRepository.findById(id);
	}
}
