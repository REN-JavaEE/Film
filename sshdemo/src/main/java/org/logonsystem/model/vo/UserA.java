package org.logonsystem.model.vo;

public class UserA {
	private String vaildCode;
	private String qq;
	private String userName;
	private String password;
	private String gender;
	private int age;
	private String realName;
	private String headPhoto;
	
	public UserA() {
		super();
	}

	public UserA(String qq, String userName, String password, String gender, int age, String realName,
			String headPhoto) {
		super();
		this.qq = qq;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.realName = realName;
		this.headPhoto = headPhoto;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getHeadPhoto() {
		return headPhoto;
	}

	public void setHeadPhoto(String headPhoto) {
		this.headPhoto = headPhoto;
	}

	public String getVaildCode() {
		return vaildCode;
	}

	public void setVaildCode(String vaildCode) {
		this.vaildCode = vaildCode;
	}

	@Override
	public String toString() {
		return "UserA [vaildCode=" + vaildCode + ", qq=" + qq + ", userName=" + userName + ", password=" + password
				+ ", gender=" + gender + ", age=" + age + ", realName=" + realName + ", headPhoto=" + headPhoto + "]";
	}

	
	

}
