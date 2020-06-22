package com.LERR.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.LERR.amazonviewer.model.Book;
import com.LERR.amazonviewer.model.Chapter;
import com.LERR.amazonviewer.model.Movie;
import com.LERR.amazonviewer.model.Serie;
import com.LERR.makereport.Report;

public class Main {

	public static ArrayList<Movie> movies = Movie.makeMoviesList();
	public static ArrayList<Serie> series = Serie.makeSeriesList();
	public static ArrayList<Book> books = Book.makeBooksList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showMenu();

	}
	
	public static void showMenu() {
		int exit = 0;
		do {
			
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
			//Leer la respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			switch (response) {
				case 0:
					//salir
					exit=0;
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
					//Date date = new Date();
					makeReport(new Date());
					break;
	
				default:
					System.out.println();
					System.out.println("....¡¡Selecciona una opción!!....");
					System.out.println();
					break;
			}
			
			
		}while(exit != 0);
	}
	
	public static void showMovies() {
		int exit = 1;
		 
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				exit=0;
				showMenu();
			}
			if(response>0) {
			
				Movie movieSelected = movies.get(response-1);
				movieSelected.setViewed(true);
				Date dateI = movieSelected.startToSee(new Date());
				
				for (int i = 0; i < 100000; i++) {
					System.out.println("..........");
				}
				
				//Termine de verla
				movieSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("Viste: " + movieSelected);
				System.out.println("Por: " + movieSelected.getTimeViewed() + " milisegundos");
				
			}			
		}while(exit !=0);
		
	}
	
	public static void showSeries() {
		int exit = 1;		
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			
			for (int i = 0; i < series.size(); i++) { //1. Serie 1
				System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			if(response >0) {
				showChapters(series.get(response-1).getChapters());
			}
			
		}while(exit !=0);
	}
	
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 0;
		
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
			
			
			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("..........");
			}
			
			//Termine de verla
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + chapterSelected);
			System.out.println("Por: " + chapterSelected.getTimeViewed() + " milisegundos");
		}while(exit !=0);
	}
	
	public static void showBooks() {
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
			
			for (int i = 0; i < books.size(); i++) { 
				System.out.println(i+1 + ". " + books.get(i).getTitle() + " Le�do: " + books.get(i).isReaded());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				exit=0;
				showMenu();
			}
			if(response>0) {
			
				Book movieSelected = books.get(response-1);
				movieSelected.setReaded(true);
				Date dateI = movieSelected.startToSee(new Date());
				
				for (int i = 0; i < 100000; i++) {
					System.out.println("..........");
				}
				
				//Termine de verla
				movieSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("Viste: " + movieSelected);
				System.out.println("Por: " + movieSelected.getTimeReaded() + " milisegundos");
				
			}			
			
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
		Report report=new Report();
		report.setNameFile("Reporte");
		report.setTitle(":: Vistos ::");
		report.setExtension("txt");
		String contentReport=report.getTitle();
		
		for (Movie movie : movies) {
			String visto="";
			if(movie.getIsViewed()) {
				contentReport+="\n"+movie.toString();
			}
		}
		for (Serie serie : series) {
			String visto="";
			if(serie.getIsViewed()) {
				contentReport+="\n"+serie.toString();
			}
		}
		for (Book book : books) {
			String leido="";
			if(book.getIsReaded()) {
				contentReport+="\n"+book.toString();
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
	}
	
	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString=df.format(date);
		
		Report report=new Report();
		report.setNameFile("Reporte "+dateString);
		
		report.setTitle(":: Vistos el "+ dateString+" ::");
		report.setExtension("txt");
		String contentReport=report.getTitle();
		
		for (Movie movie : movies) {
			String visto="";
			if(movie.getIsViewed()) {
				contentReport+="\n"+movie.toString();
			}
		}
		for (Serie serie : series) {
			String visto="";
			if(serie.getIsViewed()) {
				contentReport+="\n"+serie.toString();
			}
		}
		for (Book book : books) {
			String leido="";
			if(book.getIsReaded()) {
				contentReport+="\n"+book.toString();
			}
		}
		report.setContent(contentReport);
		report.makeReport();
	}
	
}
