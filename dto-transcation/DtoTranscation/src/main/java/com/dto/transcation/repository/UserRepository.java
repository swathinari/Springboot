package com.dto.transcation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.transcation.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
