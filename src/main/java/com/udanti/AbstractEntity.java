package com.udanti;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.envers.Audited;


@MappedSuperclass
@Audited
public class AbstractEntity implements Entity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	public Long getId() {
		return id;
	}

	public Long setId(Long id) {
		return id;
	}
	
	

}
