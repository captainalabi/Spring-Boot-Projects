package com.collabo.bootDemo.model;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="employees")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
private long id;
	
	@Column(name="first_name", nullable=false)
private String firstName;
	
	@Column(name="last_name")
private String lastName;
	
	@Column(name="email")
private String email;

	//---------------------getters and setters introduced instead of lombok activation---------------------------
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
