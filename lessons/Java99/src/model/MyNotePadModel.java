package model;

public class MyNotePadModel {
	private String fileName;
	private String content;

	public MyNotePadModel(String fileName, String content) {
		super();
		this.fileName = "";
		this.content = "";
	}

	public MyNotePadModel() {
		// TODO Auto-generated constructor stub
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
