package com.project.model;

import java.io.Serializable;

public class Library implements Serializable {

		private static final long serialVersionUID=1L;
	
	
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	private String bookName;
	private String authorName;
	private double bookPrice;
	@Override
	public String toString() {
		return "Subject [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", bookPrice="
				+ bookPrice + "]";
	}	
	
}


    