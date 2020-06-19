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
		//Declaración
		int[] arregloInt = new int[3];
		double arregloIdouble[];
		
		int[][] array2D=new int[2][3];
		int[][][] array3D=new int[3][3][2];
		int [][][][] array4D=new int[1][2][3][4];
		
		//Asignación de Valores
		char [][] days = {{'M','T','W'} , {'M','T','W'} };
		
		char[] names =new char [4];
		names[0]='h';
		names[1]='o';
		names[2]='l';
		names[3]='a';
		//Obtención de Valores
		/*
		System.out.print(names[0]);
		System.out.print(names[1]);
		System.out.print(names[2]);
		System.out.println(names[3]);		
		*/
		char[][][][] monkey=new char[2][3][2][2];
		monkey[1][0][0][1]='m';
		//System.out.println(monkey[1][0][0][1]);
		
		//Operadores Aritméticos
		int a=1;
		int aa=a+a;
		//System.out.println("El valor de aa es: "+aa);
		double x=2.56;
		int y =9;
		float w=(float)x+y;
		//System.out.println(w);
		
		//System.out.println(w*2);
		double k=4/0.002;
		//System.out.println(k);		
		//System.out.println(7%2);
		
		//Operadores de Asignación
		double f =2;
		int g=3;
		f /=g;
		//System.out.println(f);
		
		//Operadores de Incremento/Decremento
		int l=3;
		l++;
		++l;
		//System.out.println(l);
		
		//Operadores de Equidad
		int q=5;
		int p=4;
		//System.out.println(q==p);
		//System.out.println(q!=p);
		
		//Operadores de Relación
		/*
		System.out.println("q < p ->"+(q < p));
		System.out.println("q > p ->"+(q > p));
		
		System.out.println("q <= p ->"+(q <= p));
		System.out.println("q >= p ->"+(q >= p));
		*/
		//Operadores Lógicos
		boolean n=false;
		boolean m=true;
		
		/*
		System.out.println("n && m ->"+(n&&m));
		System.out.println("n || m ->"+(n||m));
		
		System.out.println("!n ->"+!n);
		System.out.println("!m ->"+!m);
		*/
		
		//--------------Control de Flujo-----------------------------
		//-----IF ELSE--------------
		/*
		if (q>p) {
		System.out.println("q es mayor que p");
		}else if (q==p) {
			System.out.println("q y p son iguales");
		}else {
			System.out.println("q es menor que p");
		}*/
		//-----Switch--------------
		int mes =8;
		/*switch (mes) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("Ese Mes no existe");
				break;
		}*/
		//------While---------
		int e = 1;
		/*
		while (e <=5) {
			System.out.println("e igual a "+e);
			e++;
		}
		System.out.println("Continuamos con el flujo");
		*/
		//-----For------------
		
	}
}
