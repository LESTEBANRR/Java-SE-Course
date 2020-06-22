package com.LERR.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable{

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
	public String isReaded() {
		String visto="";
		if (this.readed==true) {
			visto="Yes";
		}else {
			visto="No";
		}
		return visto;
	}
	public boolean getIsReaded() {
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

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime()>dateI.getTime()) {
			setTimeReaded((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeReaded(0);
		}
	}
	
	public static ArrayList<Book> makeBooksList(){
		ArrayList<Book> books=new ArrayList<Book>();		
		for (int i = 1; i <6; i++) {
			String[] autor= { "Autor "+i, "Autor "+(i+1)};
			books.add(new Book("Book "+i, new Date(), "Editorial "+i, autor, "ISBN "+i) );
		}
		return books;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: BOOK ::" + 
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() + 
				"\n Isbn: " + getIsbn() + 
				"\n Edition Date: " + getEditionDate();
	}
}
