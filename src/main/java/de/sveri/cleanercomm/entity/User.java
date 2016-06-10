package de.sveri.cleanercomm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;



@Entity
@Data
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
    private String firstName;
    private String lastName;

}
