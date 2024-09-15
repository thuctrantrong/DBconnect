package vn.iostar.model;

import java.io.Serializable;

public class Usermodel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Override
	public String toString() {
		return "Usermodel [id=" + id + ", username=" + username + ", password=" + password + ", imagines=" + imagines
				+ ", fullname=" + fullname + ", email=" + email + ", phone=" + phone + ", roleid=" + roleid
				+ ", createDate=" + createDate + "]";
	}

	private String id;
	private String username;
	private String password;
	private String imagines;
	private String fullname;
	private String email;
	private String phone;
	private int roleid;
	private String createDate;

	public Usermodel(String id2, String username, String password, String imagines, String fullname,String email, String phone, int roleid2, String createDate) {
		super();
		this.id = id2;
		this.username = username;
		this.password = password;
		this.imagines = imagines;
		this.fullname = fullname;
		this.email =email ;
		this.phone = phone ; 
		this.roleid = roleid2 ; 
		this.createDate = createDate;
	}

	public Usermodel( String username, String password, String imagines, String fullname,String email, String phone, int roleid2, String createDate) {
		super();
		this.username = username;
		this.password = password;
		this.imagines = imagines;
		this.fullname = fullname;
		this.email =email ;
		this.phone = phone ; 
		this.roleid = roleid2 ; 
		this.createDate = createDate;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}