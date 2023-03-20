package com.production.modal;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
private static final long serialVersionUID = 2002216935203335174L;
	@Id
	@GeneratedValue
private int courseId;
private String courseName;
private double price;

}
