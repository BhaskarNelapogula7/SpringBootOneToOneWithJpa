package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_info")
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="infoId")
	private Integer id;
	
	@Column(name="user_mobile")
	private String mobile;
	
	@Column(name="user_gender")
	private String gender;
	
	@Column(name="user_city")
	private String city;
	
	@Column(name="user_Nationlity")
	private String nationlity;
	
	
}
