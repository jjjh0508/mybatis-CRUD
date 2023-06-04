package com.greedy.section01.remixconfig.DTO;

import java.sql.Date;

public class InsertDTO {
	private int posNum;
	private String title;
	private String contents;
	private int blogNum;
	private int cateNum;
	private Date cateDate;
	private String status;
	public InsertDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsertDTO(int posNum, String title, String contents, int blogNum, int cateNum, Date cateDate,
			String status) {
		super();
		this.posNum = posNum;
		this.title = title;
		this.contents = contents;
		this.blogNum = blogNum;
		this.cateNum = cateNum;
		this.cateDate = cateDate;
		this.status = status;
	}
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getBlogNum() {
		return blogNum;
	}
	public void setBlogNum(int blogNum) {
		this.blogNum = blogNum;
	}
	public int getCateNum() {
		return cateNum;
	}
	public void setCateNum(int cateNum) {
		this.cateNum = cateNum;
	}
	public Date getCateDate() {
		return cateDate;
	}
	public void setCateDate(Date cateDate) {
		this.cateDate = cateDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}
