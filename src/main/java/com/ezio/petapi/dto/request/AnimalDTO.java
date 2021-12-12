package com.ezio.petapi.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.ezio.petapi.enums.AnimalBreed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {
	
	private Long id;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private AnimalBreed breed;
	
}