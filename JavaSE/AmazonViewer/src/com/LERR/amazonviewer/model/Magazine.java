package com.LERR.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication{

	private int id;
	
	public Magazine(String title, Date editionDate, String editorial, String[] autors) {
		super(title, editionDate, editorial, autors);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
}
