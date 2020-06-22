package com.LERR.amazonviewer.model;

import java.util.ArrayList;

public class Serie  extends Film{

	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;
	//chapters[]

	public Serie(String title, String genre, String creator, int duration,int sessionQuantity) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.sessionQuantity=sessionQuantity;
	}
	
	public int getId() {
		return id;
	}	
	public int getSessionQuantity() {
		return sessionQuantity;
	}
	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}
	public ArrayList<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	
}
