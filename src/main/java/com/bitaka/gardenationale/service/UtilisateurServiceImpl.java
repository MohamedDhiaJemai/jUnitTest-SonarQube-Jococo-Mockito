package com.bitaka.gardenationale.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitaka.gardenationale.model.Utilisateur;
import com.bitaka.gardenationale.repository.UtilisateurRepository;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilsateurService {

	@Autowired
	UtilisateurRepository utilisateurRepo;

	@Override
	public Utilisateur addNewUser(Utilisateur utilisateur) {

		return utilisateurRepo.save(utilisateur);
	}

}
