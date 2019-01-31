package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.SysPostEntity;

public interface ISysPostservice {
	//查询
	public List<SysPostEntity> selectPostList(SysPostEntity spEntity);
	
	
	public Integer insertMoreEntity(SysPostEntity list) throws Exception;
}
