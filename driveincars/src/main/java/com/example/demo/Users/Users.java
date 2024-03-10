package com.example.demo.Users;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="users")
public class Users {
  
	
	
	
	 @Id
	 @Column(length=12)
	private Long mobile;
	 @Column(length=45)
	private String name;
	 @Column(length=45)
	private String email;
	 
	private LocalDate  pick_date;
	 
	 
	private LocalDate  return_date;
	 
	
	 
	
	
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public LocalDate getPick_date() {
		return pick_date;
	}
	public void setPick_date(LocalDate pick_date) {
	    this.pick_date = pick_date;
	}
	public LocalDate getReturn_date() {
		return return_date;
	}
	public void setReturn_date(LocalDate return_date) {
		this.return_date = return_date;
	}
	
	 
}