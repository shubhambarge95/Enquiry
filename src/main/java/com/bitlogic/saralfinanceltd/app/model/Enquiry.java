package com.bitlogic.saralfinanceltd.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String Email;
    private Long mobileNo;
    private String pancardNo;
	private String password;
}
