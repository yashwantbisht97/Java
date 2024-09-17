package com.yash.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="COURSE_TABLE")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer cid;
	 private String name;
	 private Double price;
	

}
