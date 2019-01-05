package com.springwebmvc.basic.bean;

public class Friend {
	
	private int id;
	private String friendName;
	private String friendLocation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public String getFriendLocation() {
		return friendLocation;
	}
	public void setFriendLocation(String friendLocation) {
		this.friendLocation = friendLocation;
	}
	public Friend(int id, String friendName, String friendLocation) {
		super();
		this.id = id;
		this.friendName = friendName;
		this.friendLocation = friendLocation;
	}
	
	public Friend() {
		super();
		
	}
	

}
