package com.dto.transcation.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.transcation.dto.UserDto;
import com.dto.transcation.entity.UserEntity;
import com.dto.transcation.repository.UserRepository;

import jakarta.transaction.Transactional;



@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Transactional
	public UserEntity createUser(UserDto userDto) {
		UserEntity userEntity = new UserEntity();
		userEntity.setName(userDto.getName());
		userEntity.setId(userDto.getId());
		userEntity.setLocation(userDto.getLocation());
		userEntity.setAge(userDto.getAge());
		
		return userRepository.save(userEntity);
	}
	
	public List<UserDto> getAllUsers() {
		List<UserEntity> getAll=userRepository.findAll();
		 return getAll.stream().map(u-> new UserDto(null, u.getName(), u.getLocation(),u.getAge())).
				 collect(Collectors.toList());
		
	}
	
	public UserDto findById(Integer id) {
		//UserEntity userEntity = new UserEntity();
		UserEntity getById= userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
		 return new UserDto(getById.getId(), 
				 getById.getName(),
				 getById.getLocation(),
				 getById.getAge());
	}
	public UserDto updateById(Integer id, UserDto userDto) {
		UserEntity existedUser=userRepository.findById(id).
				orElseThrow(()-> new RuntimeException("User not found with id: " + id));
		existedUser.setAge(userDto.getAge());
		existedUser.setName(userDto.getName());
		existedUser.setLocation(userDto.getLocation());
		UserEntity saveData=userRepository.save(existedUser);
		return new UserDto(saveData.getAge(),saveData.getName(),saveData.getLocation(),saveData.getId());
	}
	
	


}
