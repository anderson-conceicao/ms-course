package br.com.devtech.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devtech.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
