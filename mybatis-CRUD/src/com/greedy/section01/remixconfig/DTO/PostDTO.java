package com.greedy.section01.remixconfig.DTO;

import java.sql.Date;

public class PostDTO {
	
	private int posNum;
	private int blogNum;
	private String blogName;
	private int cateNum;
	private String cateName;
	private int fileNum;
	private String title;
	private String contents;
	private Date cateDate;
	private String status;
	public PostDTO() {
		
	}
	public PostDTO(int posNum, int blogNum, String blogName, int cateNum, String cateName, int fileNum, String title,
			String contents, Date cateDate, String status) {
		super();
		this.posNum = posNum;
		this.blogNum = blogNum;
		this.blogName = blogName;
		this.cateNum = cateNum;
		this.cateName = cateName;
		this.fileNum = fileNum;
		this.title = title;
		this.contents = contents;
		this.cateDate = cateDate;
		this.status = status;
	}
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public int getBlogNum() {
		return blogNum;
	}
	public void setBlogNum(int blogNum) {
		this.blogNum = blogNum;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public int getCateNum() {
		return cateNum;
	}
	public void setCateNum(int cateNum) {
		this.cateNum = cateNum;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public int getFileNum() {
		return fileNum;
	}
	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
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
	
	// 기본생성자 , 매개변수 있는 생성자// 게터 세터// toString 생성
	
	
	

}
