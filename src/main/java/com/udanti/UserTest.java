package com.udanti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TEST")
public class UserTest extends AbstractEntity {

	@Column(name = "UNAME")
	private String uName;
	@Column(name = "PASSWORD")
	private String password;

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
