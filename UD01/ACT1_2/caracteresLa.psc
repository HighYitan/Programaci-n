Algoritmo caracteresLa
	Escribir "Escriba X para salir del programa, se analizar� el car�cter que se introduzca y se contara las veces que aparece la part�cula LA en la cadena de car�cteres al terminar, por favor, escriba letras en MAY�SCULAS de una en una.";
	definir letra_anterior como cadena;
	definir LA como n�mero;
	LA<-0;
	Leer letra;
	Mientras letra <> "X" Hacer
		Escribir letra_anterior, letra;
		Si letra_anterior = "L" y letra = "A" Entonces
			LA<-LA+1;
		FinSi
		letra_anterior<-letra;
		Escribir "Escriba otra letra en MAY�SCULAS o una X para salir y ver cuantas veces se repite LA.";
		Leer letra;
	Fin Mientras
	Escribir "La part�cula LA se repite " LA " vez/veces en la palabra.";
FinAlgoritmo