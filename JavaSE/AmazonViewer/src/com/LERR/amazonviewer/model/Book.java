package com.LERR.amazonviewer.model;

import java.util.Date;

public class Book extends Publication{

	private int id;	
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	public Book(String title, Date editionDate, String editorial, String[] autors, String isbn) {
		super(title, editionDate, editorial, autors);
		// TODO Auto-generated constructor stub
		this.isbn=isbn;
	}
	
	public int getId() {
		return id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isReaded() {
		return readed;
	}
	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	public int getTimeReaded() {
		return timeReaded;
	}
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	
}
