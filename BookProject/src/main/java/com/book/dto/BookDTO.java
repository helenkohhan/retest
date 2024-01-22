package com.book.dto;

import org.apache.ibatis.type.Alias;

@Alias("book")
public class BookDTO {
	
	private String isbn;
	private String btitle;
	private String bwriter;
	private String bpublisher;
	private int bmoney;
	private int bsellcount;
	
	public BookDTO() {

	}

	public BookDTO(String isbn, String btitle, String bwriter, String bpublisher, int bmoney, int bsellcount) {
		this.isbn = isbn;
		this.btitle = btitle;
		this.bwriter = bwriter;
		this.bpublisher = bpublisher;
		this.bmoney = bmoney;
		this.bsellcount = bsellcount;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBpublisher() {
		return bpublisher;
	}

	public void setBpublisher(String bpublisher) {
		this.bpublisher = bpublisher;
	}

	public int getBmoney() {
		return bmoney;
	}

	public void setBmoney(int bmoney) {
		this.bmoney = bmoney;
	}

	public int getBsellcount() {
		return bsellcount;
	}

	public void setBsellcount(int bsellcount) {
		this.bsellcount = bsellcount;
	}

	@Override
	public String toString() {
		return "BookDTO [isbn=" + isbn + ", btitle=" + btitle + ", bwriter=" + bwriter + ", bpublisher=" + bpublisher
				+ ", bmoney=" + bmoney + ", bsellcount=" + bsellcount + "]";
	}

	

	
	

}
