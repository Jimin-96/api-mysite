package com.javaex.vo;

import org.springframework.web.multipart.MultipartFile;

public class AttachVo2 {
	
	//Fields
	private int no;
	private String orginalName;
	private String saveName;
	private String filePath;
	private long fileSize;
	private String content;
	private MultipartFile img;
	
	
	//Constructors
	
	

	public AttachVo2(int no, String orginalName, String saveName, String filePath, long fileSize) {
		this.no = no;
		this.orginalName = orginalName;
		this.saveName = saveName;
		this.filePath = filePath;
		this.fileSize = fileSize;
	}
	
	public AttachVo2(String orginalName, String saveName, String filePath, long fileSize) {
		
		this.orginalName = orginalName;
		this.saveName = saveName;
		this.filePath = filePath;
		this.fileSize = fileSize;
	}
	
	//Getter and Setters
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public MultipartFile getImg() {
		return img;
	}

	public void setImg(MultipartFile img) {
		this.img = img;
	}

	public AttachVo2() {
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOrginalName() {
		return orginalName;
	}

	public void setOrginalName(String orginalName) {
		this.orginalName = orginalName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "AttachVo2 [no=" + no + ", orginalName=" + orginalName + ", saveName=" + saveName + ", filePath="
				+ filePath + ", fileSize=" + fileSize + ", content=" + content + ", img=" + img + "]";
	}

	
	//Methods
	
	
	
	
	
}