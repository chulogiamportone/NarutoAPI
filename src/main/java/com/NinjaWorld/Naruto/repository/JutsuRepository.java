package com.NinjaWorld.Naruto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NinjaWorld.Naruto.model.Jutsu;



public interface JutsuRepository extends JpaRepository<Jutsu, Long>  {

}
