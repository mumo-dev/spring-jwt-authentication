package com.example.demo.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String  email;
	
	private String fullname;
	
	private String  password;
	
	private boolean enabled;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Role> roles;
	
	
	public User() {
		
	}
	
	

	public User(String email, String fullname, String password, boolean enabled, Set<Role> roles) {
		super();
		this.email = email;
		this.fullname = fullname;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", fullname=" + fullname + ", password=" + password
				+ ", enabled=" + enabled + ", roles=" + roles + "]";
	}
	
	
	
	
	

}
