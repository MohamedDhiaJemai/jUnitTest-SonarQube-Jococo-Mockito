package com.bitaka.gardenationale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitaka.gardenationale.model.Utilisateur;
import com.bitaka.gardenationale.service.UtilsateurService;

@Controller
@RequestMapping(value = "/Utilisateur")
public class UtilisateurController {

	@Autowired
	UtilsateurService utilsateurService;

	@PostMapping(value = "/addUser")
	public ResponseEntity<Utilisateur> ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {

		return new ResponseEntity<>(utilsateurService.addNewUser(utilisateur), HttpStatus.OK);
	}
}
