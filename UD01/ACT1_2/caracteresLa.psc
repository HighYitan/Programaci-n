Algoritmo caracteresLa
	Escribir "Escriba X para salir del programa, se analizará el carácter que se introduzca y se contara las veces que aparece la partícula LA en la cadena de carácteres al terminar, por favor, escriba letras en MAYÚSCULAS de una en una.";
	definir letra_anterior como cadena;
	definir LA como número;
	LA<-0;
	Leer letra;
	Mientras letra <> "X" Hacer
		Escribir letra_anterior, letra;
		Si letra_anterior = "L" y letra = "A" Entonces
			LA<-LA+1;
		FinSi
		letra_anterior<-letra;
		Escribir "Escriba otra letra en MAYÚSCULAS o una X para salir y ver cuantas veces se repite LA.";
		Leer letra;
	Fin Mientras
	Escribir "La partícula LA se repite " LA " vez/veces en la palabra.";
FinAlgoritmo