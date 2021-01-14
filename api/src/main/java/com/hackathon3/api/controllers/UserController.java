package com.hackathon3.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon3.api.dto.UserDto;
import com.hackathon3.api.entities.User;
import com.hackathon3.api.services.UserService;



@CrossOrigin(origins ="*", maxAge=3600)
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	
    @PostMapping
    public User create(@RequestBody UserDto dto) {
        return userService.createUser(dto);
    }
	
    @GetMapping
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }


    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody UserDto dto) {
        return userService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
    	userService.delete(id);
    }
}
