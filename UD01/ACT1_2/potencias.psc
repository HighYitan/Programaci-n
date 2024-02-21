Algoritmo potencias
	Definir elevado como entero;
	elevado<-1;
	Escribir "Este programa calcula la potencia de un número base entero.";
	Escribir "Introduzca un número base, por favor.";
	Leer base;
	Escribir "Introduzca la potencia a la que quiere elevar el número base.";
	Leer potencia;
	Para contador<-1 Hasta potencia Con Paso 1 Hacer
		elevado<-base*elevado;
	FinPara
	Escribir base " Elevado a " potencia " es igual a " elevado;
FinAlgoritmo