package vn.iostar.model;

import java.io.Serializable;

public class Usermodel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", password=" + password + ", imagines=" + imagines
				+ ", fullname=" + fullname + "]";
	}

	private String id;
	private String username;
	private String password;
	private String imagines;
	private String fullname;

	public Usermodel(String id, String username, String password, String imagines, String fullname) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.imagines = imagines;
		this.fullname = fullname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getImagines() {
		return imagines;
	}

	public void setImages(String imagines) {
		this.imagines = imagines;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}