package com.One.models;

import javax.persistence.Entity;

@Entity
public class Followings {
	
	private long id;
	
	private long followingId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFollowingId() {
		return followingId;
	}

	public void setFollowingId(long followingId) {
		this.followingId = followingId;
	}
	
	
}
