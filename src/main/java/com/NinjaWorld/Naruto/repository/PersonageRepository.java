package com.NinjaWorld.Naruto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NinjaWorld.Naruto.model.Personage;

public interface PersonageRepository extends JpaRepository<Personage, Long> {

	
}
