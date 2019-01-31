package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.SysPostEntity;

@Mapper
public interface PostMapper {
	
	//查询列表
	public List<SysPostEntity> selectPostList(SysPostEntity spEntity);
	
	public Integer insertMoreEntity(SysPostEntity list);
}
