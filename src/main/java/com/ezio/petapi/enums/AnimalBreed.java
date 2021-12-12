package com.ezio.petapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnimalBreed {
	
	DOG("Dog"),
	CAT("Cat"),
	RABIT("Rabit"),
	BIRD("Bird");
	
	private final String description;
}
