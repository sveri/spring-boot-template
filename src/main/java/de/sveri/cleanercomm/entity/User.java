package de.sveri.cleanercomm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
	
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 100, message = "Username must at least 3 characters.")
    @Column(unique = true)
    private String userName;
    
    @NotNull
    @Size(min = 3, max = 100, message = "Password must at least 3 characters.")
    private String password;
    
    @Transient
    private String confirmPassword;
    
    @Email(message = "Email address is not valid.")
    @NotNull
    @Column(unique = true)
    private String email;
    
    private String token;
    
    private String role = "ROLE_USER";
    
    private String lastLogin;
    
    public Boolean isAdmin() {
        return this.role.equals("ROLE_ADMIN");
    }
    
    public Boolean isMatchingPasswords() {
        return this.password.equals(this.confirmPassword);
    }
}