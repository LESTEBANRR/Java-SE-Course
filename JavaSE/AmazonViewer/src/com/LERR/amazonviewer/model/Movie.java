package com.LERR.amazonviewer.model;

public class Movie {

	public int id;
	public String title;
	public String genre;
	public String creator;
	public int duration;
	public short year;
	public boolean viewed;
	public int timeViewed;
	
	
	public Movie(int id, String title, String genre, String creator, int duration, short year) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
		this.year = year;
	}

	public Movie(String title, String genre, short year) {
		super();
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	
	public void showData() {
		System.out.println("Title: "+this.title);
		System.out.println("Genre: "+this.genre);
		System.out.println("Year: "+this.year);
	}
	
	
	
}
