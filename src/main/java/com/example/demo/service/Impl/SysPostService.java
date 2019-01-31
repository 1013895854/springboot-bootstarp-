package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.PostMapper;
import com.example.demo.entity.SysPostEntity;
import com.example.demo.service.ISysPostservice;
import com.github.pagehelper.PageHelper;

@Service
@Transactional(rollbackFor=Exception.class)
public class SysPostService implements ISysPostservice{
	
	@Autowired
	PostMapper postMapper;
	
	@Override
	public List<SysPostEntity> selectPostList(SysPostEntity spEntity) {
		
        List<SysPostEntity> selectPostList = postMapper.selectPostList(spEntity);
		return selectPostList;
	}

	@Override
	public Integer insertMoreEntity(SysPostEntity list) throws Exception{
		
	
		Integer index = postMapper.insertMoreEntity(list);
		if(index==1) {
			throw new Exception();
		}
		
		return index;
	}
	
}
