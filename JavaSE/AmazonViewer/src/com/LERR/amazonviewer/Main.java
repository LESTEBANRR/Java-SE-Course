package com.LERR.amazonviewer;
import java.util.Scanner;

import javax.swing.plaf.synth.Region;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner(System.in);
		int exit=0;
		do {
			int op=0;int op2=0;
			System.out.println("-------------Welcome to Amazon Viewer-------------");
			System.out.println("");
			System.out.println("Choose the number of the option that you want:");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Exit");			
			//Leer la respuesta del usuario
			op=sc.nextInt();
			switch(op) {
			case 1: // Si selecciona Movies
				//Limpiar Consola
				/*
				try {new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {//No hacer nada }
		        */			
				do {
					System.out.println("----------Movies---------");
					System.out.println("*Select the option that you want:");
					System.out.println("1. Exit");
					op2=sc.nextInt();
					switch(op2) {
						case 1:
							op=0;
							break;
						default:
							//Limpiar Consola
							/*
							try {new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					        } catch (Exception e) {//No hacer nada }
					        */			
							System.out.println("Esa opción no es valida");op2=0;
							break;
					}
				}while(op==1);
				System.out.println("Salio de Movies");
				break;
			case 2:
				do {
					System.out.println("----------Series---------");
					System.out.println("*Select the option that you want:");
					System.out.println("1. Exit");
					op2=sc.nextInt();
					switch(op2) {
						case 1:
							op=0;
							break;
						default:
							System.out.println("Esa opción no es valida");op2=0;
							break;
					}
				}while(op==1);
				System.out.println("Salio de Series");
				break;
			case 3:
				do {
					System.out.println("----------Books---------");
					System.out.println("*Select the option that you want:");
					System.out.println("1. Exit");
					op2=sc.nextInt();
					switch(op2) {
						case 1:
							op=0;
							break;
						default:
							System.out.println("Esa opción no es valida");op2=0;
							break;
					}
				}while(op==1);
				System.out.println("Salio de Books");
				break;
			case 4:
				do {
					System.out.println("----------Magazines---------");
					System.out.println("*Select the option that you want:");
					System.out.println("1. Exit");
					op2=sc.nextInt();
					switch(op2) {
						case 1:
							op=0;
							break;
						default:
							System.out.println("Esa opción no es valida");op2=0;
							break;
					}
				}while(op==1);
				System.out.println("Salio de magazines");
				break;
			case 5:
				exit =1;
				System.out.println("Salio de Amazon Viewer");
				break;
			default: 
				System.out.println("Esa opción no existe");
				break;
			}
			//
		}while(exit == 0);
	}

}
