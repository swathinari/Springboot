package com.dto.transcation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.transcation.dto.UserDto;
import com.dto.transcation.entity.UserEntity;
import com.dto.transcation.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping()
	public UserEntity createUser(@RequestBody UserDto userDto) {
		return userService.createUser(userDto);
		
	}
	@GetMapping
	public List<UserDto> getAll(){
		return userService.getAllUsers();
	}
	@GetMapping("{id}")
	public UserDto findById(@PathVariable Integer id) {
		return userService.findById(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<UserDto> updateById(@PathVariable Integer id, @RequestBody UserDto userDto) {
		UserDto updateById= userService.updateById(id, userDto);
		return ResponseEntity.ok(updateById);
	}

}
