package com.sy.mybatis.showcase.entity;

import com.sy.mybatis.showcase.core.base.entity.BaseEntity;

public class User extends BaseEntity {
	
	private String username;
	
	private String password;
	
	private Integer age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
