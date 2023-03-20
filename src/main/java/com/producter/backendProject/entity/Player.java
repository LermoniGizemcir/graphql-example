package com.producter.backendProject.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.Type;

@Getter
@Setter
@Data
@Entity
public class Player{
	@Id
    @GeneratedValue(generator = "UUID")
	@Type(type = "uuid-char")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private String name;
    private String surname;
    private String position;
	
	
}