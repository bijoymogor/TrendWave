package com.bijoymogor.trendwave.service;

import com.bijoymogor.trendwave.exception.UserException;
import com.bijoymogor.trendwave.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
