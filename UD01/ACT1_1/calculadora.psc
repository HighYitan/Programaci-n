Algoritmo calculadora
	Escribir "Deben introducirse dos números y se debe especificar qué tipo de operación debe realizarse (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)";
	Escribir "Introduzca el primer número, por favor.";
	Leer num1;
	Escribir "Introduzca el segundo número, por favor.";
	Leer num2;
	Escribir "Introduzca el tipo de operación que desea hacer de la siguiente manera: +, -, *, /";
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