package com.bitaka.gardenationale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Mejri Aymen
 */
@Entity
@Table(name = "utilisateur")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {

	@Id
	@Column(name = "reference")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reference;

	private String firstname;

	private String lastname;

	private String mobile;

	private String username;

	private String code;

}
