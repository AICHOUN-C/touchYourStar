/*package com.hackathon3.api.mappers;

import org.springframework.stereotype.Component;

import com.hackathon3.api.dto.UserAdminDto;
import com.hackathon3.api.dto.UserDto;
import com.hackathon3.api.entities.User;

@Component
public class UserMapper {

	
	public User createUserAdmin(UserAdminDto dto) {
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setCreatedAt(dto.getCreatedAt());
		user.setUpdatedAt(dto.getUpdatedAt());
		user.setRoleList(dto.getRoleList());
		return user;
	}
	
	public User updateUserAdmin(User user, UserAdminDto dto) {
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setCreatedAt(dto.getCreatedAt());
		user.setUpdatedAt(dto.getUpdatedAt());
		return user;
	}
	
	public User createUser(UserDto dto) {
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		return user;
	}
	
	public User updateUser(User user, UserDto dto) {
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		return user;
	}
}*/
