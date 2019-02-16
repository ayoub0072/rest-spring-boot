package com.dev.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable{

	@Id
	@GeneratedValue
	private Long idUser;
	private String nomtest;
	private String nomUser;
	private String prenomUser;
	private int ageUser;
	
	@OneToMany(mappedBy="user")
	private List<Post> posts;
	
	
}
