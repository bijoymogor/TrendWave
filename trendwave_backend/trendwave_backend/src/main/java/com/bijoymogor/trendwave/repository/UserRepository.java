package com.bijoymogor.trendwave.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bijoymogor.trendwave.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
