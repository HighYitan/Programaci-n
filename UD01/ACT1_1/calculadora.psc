Algoritmo calculadora
	Escribir "Deben introducirse dos n�meros y se debe especificar qu� tipo de operaci�n debe realizarse (SUMA, RESTA, MULTIPLICACI�N, DIVISI�N)";
	Escribir "Introduzca el primer n�mero, por favor.";
	Leer num1;
	Escribir "Introduzca el segundo n�mero, por favor.";
	Leer num2;
	Escribir "Introduzca el tipo de operaci�n que desea hacer de la siguiente manera: +, -, *, /";
	Leer operacion;
	Si operacion = "+" Entonces
		Escribir num1 " + " num2 " es igual a " num1+num2;
	SiNo
		Si operacion = "-" Entonces
			Escribir num1 " - " num2 " es igual a " num1-num2;
		Sino 
			Si operacion = "*" Entonces
				Escribir num1 " X " num2 " es igual a " num1*num2;
			Sino
				Si operacion = "/" Entonces
					Escribir num1 " / " num2 " es igual a " num1/num2;
				FinSi
			FinSi
		FinSi
	Fin Si
FinAlgoritmo