package com.javaex.vo;

public class AttachVo {
	
	//Fields
	private int no;
	private String orginalName;
	private String saveName;
	private String filePath;
	private long fileSize;
	
	//Constructors
	
	public AttachVo() {
		
	}

	public AttachVo(int no, String orginalName, String saveName, String filePath, long fileSize) {
		this.no = no;
		this.orginalName = orginalName;
		this.saveName = saveName;
		this.filePath = filePath;
		this.fileSize = fileSize;
	}
	
	public AttachVo(String orginalName, String saveName, String filePath, long fileSize) {
		
		this.orginalName = orginalName;
		this.saveName = saveName;
		this.filePath = filePath;
		this.fileSize = fileSize;
	}
	
	//Getter and Setters

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

	
	//Methods
	@Override
	public String toString() {
		return "AttachVo [no=" + no + ", orginalName=" + orginalName + ", saveName=" + saveName + ", filePath="
				+ filePath + ", fileSize=" + fileSize + "]";
	}
	
	
	
	
	
	
}