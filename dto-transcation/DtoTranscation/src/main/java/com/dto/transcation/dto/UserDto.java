package com.dto.transcation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data  //setter+getter
public class UserDto {
	private Integer id;
	private String name;
	private String location;
	private Integer age;
	

}
