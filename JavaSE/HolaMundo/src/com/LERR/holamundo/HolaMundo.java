package com.LERR.holamundo;

public class HolaMundo {

	public static void main(String[] args) {
		//System.out.println("Hola Mundo");
		
		// Tipos de Datos Enteros
		byte edad = 127;
		short year = -32768;
		int id_user = 1001;
		long id_twiteer=11234567891234567L;
		
		// Punto Flotante
		float diametro = 34.25f;
		double precio = 1234.2233404958487844;
		
		//Texto
		char genero = 'M';
		
		 //Logico
		boolean isVisible = true;
		
		//Constamtes
		int VALOR =0;
		int VALOR_MAXIMO=1;
		
		//Arrays
		//Declaraci�n
		int[] arregloInt = new int[3];
		double arregloIdouble[];
		
		int[][] array2D=new int[2][3];
		int[][][] array3D=new int[3][3][2];
		int [][][][] array4D=new int[1][2][3][4];
		
		char [][] days = {{'M','T','W'} , {'M','T','W'} };
		
		char[] names =new char [4];
		names[0]='h';
		names[1]='o';
		names[2]='l';
		names[3]='a';
		/*
		System.out.print(names[0]);
		System.out.print(names[1]);
		System.out.print(names[2]);
		System.out.println(names[3]);		
		*/
		char[][][][] monkey=new char[2][3][2][2];
		monkey[1][0][0][1]='m';
		//System.out.println(monkey[1][0][0][1]);
		
		//Operadores Aritm�ticos
		int a=1;
		int aa=a+a;
		System.out.println("El valor de aa es: "+aa);
		double x=2.56;
		int y =9;
		float w=(float)x+y;
		System.out.println(w);
		
		System.out.println(w*2);
		double k=4/0.002;
		System.out.println(k);		
		System.out.println(7%2);
		
		//Operadores de Asignaci�n
		double f =2;
		int g=3;
		f /=g;
		System.out.println(f);
	}
}
