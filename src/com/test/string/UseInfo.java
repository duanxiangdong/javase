package com.test.string;

public class UseInfo {
	private String id;
	private String userId;
	private String userName;

	public static void main(String[] args) {
		UseInfo useInfo = new UseInfo();
		useInfo.setId(null);
		StringBuffer sb = new StringBuffer();
		sb.append(useInfo.getId());
		System.out.println(sb.toString());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id=").append(this.id);
		sb.append("&userId=").append(this.userId);
		sb.append("&userName=").append(this.userName);
		return sb.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}