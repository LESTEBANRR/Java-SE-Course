package com.LERR.amazonviewer.model;

public class Serie  extends Film{

	private int id;
	private int sessionQuantity;
	private Chapter[] cahpters;
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
	
	
}
