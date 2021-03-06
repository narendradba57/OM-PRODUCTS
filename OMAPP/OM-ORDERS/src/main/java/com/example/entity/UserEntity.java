package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
public UserEntity() {
	
}
    public UserEntity(Long id, String username, String password, String firstName, String lastName, String email,
			String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
    public UserEntity(String username, String password, String firstName, String lastName, String email,
			String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
    @Column(name="username")
	private String username;
    @Column(name="password")
    private String password;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	private String roles;
        public String getFirstName() {
    	return firstName;
    }

    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

    public String getLastName() {
    	return lastName;
    }

    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }

    public String getEmail() {
    	return email;
    }

    public void setEmail(String email) {
    	this.email = email;
    }

    public String getPhone() {
    	return phone;
    }

    public void setPhone(String phone) {
    	this.phone = phone;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}