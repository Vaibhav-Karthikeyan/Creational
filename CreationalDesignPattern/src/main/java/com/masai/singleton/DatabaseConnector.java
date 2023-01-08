package com.masai.singleton;

public enum DatabaseConnector {
	INSTANCE;
	private String url,username,password;

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
}
