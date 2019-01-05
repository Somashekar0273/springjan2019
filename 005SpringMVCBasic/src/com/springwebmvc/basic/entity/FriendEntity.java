package com.springwebmvc.basic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friend")
public class FriendEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="friendid")
	private int id;
	
	@Column(name="friendName")
	private String friendName;
	
	@Column(name="friendLoc")
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
	public FriendEntity(int id, String friendName, String friendLocation) {
		super();
		this.id = id;
		this.friendName = friendName;
		this.friendLocation = friendLocation;
	}
	public FriendEntity() {
		super();
	}
	
	
	
	

}
