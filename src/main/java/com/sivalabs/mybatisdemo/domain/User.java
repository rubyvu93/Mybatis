package com.sivalabs.mybatisdemo.domain;

public class User {
	private Integer userId;
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailId=" + emailId
				+ ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

	public User(String firstName) {
		this.firstName = firstName;
	}

	public User() {
		super();
	}

}
