/*package com.hackathon3.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon3.api.dto.UserAdminDto;
import com.hackathon3.api.dto.UserDto;
import com.hackathon3.api.entities.User;
import com.hackathon3.api.mappers.UserMapper;
import com.hackathon3.api.repositories.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserMapper userMapper;
	
    public User createUser(UserDto dto){
        return userRepository.save(userMapper.createUser(dto));
    }
    
    public User createUserAdmin(UserAdminDto dto){
        return userRepository.save(userMapper.createUserAdmin(dto));
    }
	
	public List<User> findAllUser(){
		return userRepository.findAll();
	}
	
	public User findUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public User update (Long id, UserDto dto) {
		User user = userRepository.findById(id).orElse(null);
		user = userMapper.updateUser(user, dto);
		return userRepository.save(user);
	}
	
	public User updateAdmin (Long id, UserAdminDto dto) {
		User user = userRepository.findById(id).orElse(null);
		user = userMapper.updateUserAdmin(user, dto);
		return userRepository.save(user);
	}
	
    public void delete(Long id){
        Optional<User> userOptional = userRepository.findById(id);
        userOptional.ifPresent(customer -> userRepository.delete(customer));
    }
}*/
