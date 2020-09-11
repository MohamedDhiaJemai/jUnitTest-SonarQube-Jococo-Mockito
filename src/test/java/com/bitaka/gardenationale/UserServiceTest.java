package com.bitaka.gardenationale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bitaka.gardenationale.model.Utilisateur;
import com.bitaka.gardenationale.repository.UtilisateurRepository;
import com.bitaka.gardenationale.service.UtilisateurServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@InjectMocks
	private UtilisateurServiceImpl userServiceImpl;

	@Mock
	private UtilisateurRepository userRepository;


	@Test
	void shouldSavedUserSuccessFully() {
		final Utilisateur user = new Utilisateur(1, "Rami", "Mejri", "20202020", "10210", "0124");

		given(userRepository.save(user)).willAnswer(invocation -> invocation.getArgument(0));

		Utilisateur savedUser = userServiceImpl.addNewUser(user);

		assertThat(savedUser).isNotNull();

		verify(userRepository).save(user);

	}

	@Test
	void testClassUtilisateur() {

		final Utilisateur user = new Utilisateur(1, "Rami", "Mejri", "20202020", "10210", "0124");

		System.out.println(user.getFirstname());
		System.out.println(user.getReference());
		System.out.println(user.getMobile());
		System.out.println(user.getUsername());
		System.out.println(user.getCode());
		System.out.println(user.getLastname());

		Utilisateur user2 = new Utilisateur();

		user2.setCode("aaa");
		user2.setFirstname("aaa");
		user2.setLastname("last");
		user2.setMobile("mobile");
		user2.setReference(2);
		user2.setUsername("username");

		System.out.println(user2.toString());

		System.out.println(user.equals(user2));
	}


}
