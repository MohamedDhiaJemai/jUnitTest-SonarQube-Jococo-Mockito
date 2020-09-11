package com.bitaka.gardenationale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bitaka.gardenationale.model.Utilisateur;
@EnableJpaRepositories
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {

}
	