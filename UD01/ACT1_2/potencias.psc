Algoritmo potencias
	Definir elevado como entero;
	elevado<-1;
	Escribir "Este programa calcula la potencia de un n�mero base entero.";
	Escribir "Introduzca un n�mero base, por favor.";
	Leer base;
	Escribir "Introduzca la potencia a la que quiere elevar el n�mero base.";
	Leer potencia;
	Para contador<-1 Hasta potencia Con Paso 1 Hacer
		elevado<-base*elevado;
	FinPara
	Escribir base " Elevado a " potencia " es igual a " elevado;
FinAlgoritmo