package com.greedy.section01.remixconfig.DTO;

public class ModifyPostDTO {
	private int posNum;
	private String title;
	private String contents;
	public ModifyPostDTO() {
	}
	public ModifyPostDTO(int posNum, String title, String contents) {
		super();
		this.posNum = posNum;
		this.title = title;
		this.contents = contents;
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
	
	

}
