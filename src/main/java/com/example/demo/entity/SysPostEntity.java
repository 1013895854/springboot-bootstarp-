package com.example.demo.entity;

import java.util.Date;

public class SysPostEntity {
	private int postId;
	private String postCode;
	private String postName;
	private Date createTime;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Override
	public String toString() {
		return "SysPostEntity [postId=" + postId + ", postCode=" + postCode + ", postName=" + postName + ", createTime="
				+ createTime + "]";
	}
	
	
	
}
