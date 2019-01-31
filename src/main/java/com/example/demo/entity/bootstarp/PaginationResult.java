package com.example.demo.entity.bootstarp;

import java.util.List;

/**
 * 用于返回分页结果
 */
public class PaginationResult {
	//返回的总页数
	private long total;
	//本次分页返回的数据（泛型）
	private List<?> rows;
	
	public PaginationResult(long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	@Override
	public String toString() {
		return "PaginationResult [total=" + total + ", rows=" + rows + "]";
	}
	

    
}
