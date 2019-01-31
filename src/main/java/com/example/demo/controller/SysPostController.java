package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.SysPostEntity;
import com.example.demo.entity.bootstarp.PaginationResult;
import com.example.demo.service.ISysPostservice;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/SysPost")
public class SysPostController {
	
	@Autowired
	ISysPostservice sysPostservice; 
	
	//返回json数据
	@RequestMapping("/list")
	public String selectPostList(ModelMap mmap) {
		SysPostEntity spEntity = new SysPostEntity();
		 //使用分页插件,核心代码就这一行
		PageHelper.startPage(1, 2);
		List<SysPostEntity> selectPostList = sysPostservice.selectPostList(spEntity);
		System.out.println("#######"+selectPostList.size());
		mmap.addAttribute("selectPostList", selectPostList);
		
		return "Tymeleaf";
	
	}
	
	@RequestMapping("/bootStare")
	public String bootStarp() {
		return "bootstarp";
		
	}
	@RequestMapping("/boot")
	@ResponseBody
	public PaginationResult getPers(Integer limit, Integer offset, String departmentname) {
		
		System.out.println(departmentname);
		System.out.println(offset);
		System.out.println(limit);
		//页数处理
		Integer pageindex = 0;
		if(offset!=0) {
			pageindex = offset/limit;
		}
		pageindex+=1;
		SysPostEntity spEntity = new SysPostEntity();
		 //使用分页插件,核心代码就这一行
		PageHelper.startPage(pageindex,limit);
		List<SysPostEntity> selectPostList = sysPostservice.selectPostList(spEntity);
		System.out.println("#########"+selectPostList.size());
        List<SysPostEntity> pers = sysPostservice.selectPostList(spEntity);
        long index = (long) pers.size();
        return new PaginationResult(index, selectPostList);
    }
	
	
	//测试ajax
	@RequestMapping("/change")
	@ResponseBody
	public String test(String name,String pwd) {
		
		System.out.println(name+pwd);
		return "写入完成";
			
			
	}
	
	//测试模态框
	@RequestMapping("/modal")
	public String test1() {
		System.out.println("66666666666");
		return "Modal-toggle";
			
			
	}
	
	//测试编辑
	@RequestMapping("/selectById")
	@ResponseBody
	public SysPostEntity test2(Integer id) {
		SysPostEntity spEntity = new SysPostEntity();
		spEntity.setPostId(id);
		List<SysPostEntity> selectPostList = sysPostservice.selectPostList(spEntity);
		System.out.println("###############"+selectPostList.get(0));
		return selectPostList.get(0);
	
	}
		
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insertMoreEntity() {
		
//		for (int i = 0; i < 50; i++) {
//			spEntity.setPostCode("it");
//			spEntity.setPostName("IT工程师");
//			sysPostservice.insertMoreEntity(spEntity);
//		}
		SysPostEntity spEntity1 = new SysPostEntity();
		spEntity1.setPostCode("test1");
		spEntity1.setPostName("test1");
		SysPostEntity spEntity = new SysPostEntity();
		spEntity.setPostCode("test");
		spEntity.setPostName("test44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
		List<SysPostEntity> list = new ArrayList<SysPostEntity>();
		list.add( spEntity1);
		list.add( spEntity);
		try {
			sysPostservice.insertMoreEntity( list.get(0) );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for (int i = 0; i <list.size(); i++) {
//				sysPostservice.insertMoreEntity( list.get(i) );
//		}
		
		return "写入完成";
			
			
	}
	
}
