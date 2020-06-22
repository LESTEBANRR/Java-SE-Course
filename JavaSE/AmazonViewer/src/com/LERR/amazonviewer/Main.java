package com.LERR.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.LERR.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}
	
	public static void showMenu() {
		int exit = 0;
		do {
			
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el n�mero de la opci�n deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
			//Leer la respuesta del usuario
			Scanner sc=new Scanner(System.in);			
			int response = Integer.valueOf(sc.nextLine());
			switch (response) {
				case 0:
					//salir
					
					break;
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					break;
				case 6:
					makeReport(new Date());
					break;
	
				default:
					System.out.println();
					System.out.println("....��Selecciona una opci�n!!....");
					System.out.println();
					break;
			}
			
			
		}while(exit != 0);
	}
	
	public static void showMovies() {
		int exit = 1;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			for (int i = 0; i < movies.size(); i++) {
				System.out.println((i+1)+". "+movies.get(i).getTitle()+" Visto: "+movies.get(i).isViewed());
			}
			System.out.println("0. Return to Menu \n");
			//Leer Respuesta del Usuario
			Scanner sc=new Scanner(System.in);
			int response=Integer.valueOf(sc.nextLine());
			
			if (response==0) {
				exit = 0 ;
				showMenu();
			}
			
			Movie movieSelected=movies.get(response-1);
			movieSelected.setViewed(true);
			Date dateI=movieSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("...");
			}
			
			//Termine de verla
			movieSelected.stopToSee(dateI, new Date());
			System.out.println("Viste "+movieSelected.getTitle()+" por "+movieSelected.getTimeViewed()+" mil�segundos");
		}while(exit !=0);
		
	}
	
	public static void showSeries() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showChapters() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showBooks() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void makeReport() {
		
	}
public static void makeReport(Date date) {
		
	}
	
}

