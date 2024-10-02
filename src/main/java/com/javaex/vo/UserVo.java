package com.javaex.vo;

public class UserVo {
	
	
	private int userNum;
	private String userId;
	private String userName;
	private String userPw;
	private String userGender;
	
	
	public UserVo() {
		
	}
	
	public UserVo(int userNum,String userId, String userName, String userPw, String userGender) {
		this.userNum = userNum;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userGender = userGender;
	}
	
	public UserVo(String userId, String userPw, String userName, String userGender) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userGender = userGender;
	}
	public UserVo(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	@Override
	public String toString() {
		return "User [userNum=" + userNum + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userGender=" + userGender + "]";
	}
	
	
	
	
}
