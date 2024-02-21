Algoritmo palabraLa
	Escribir "Escriba X para salir del programa, se analizará la palabra que se introduzca y se contara las veces que aparece la partícula LA, por favor, escriba palabras en MAYÚSCULAS.";
	definir letras como cadena;
	definir LA, long, contador1, contador2 como número;
	contador1<-1;
	contador2<-2;
	Leer palabra;
	Mientras palabra <> "X" Hacer
		long<-Longitud(palabra);
		Mientras long-long+contador2 <= long Hacer
			letras<-SubCadena(palabra, long-long+contador1, long-long+contador2);
			Escribir letras;
			contador1<-contador1+1;
			contador2<-contador2+1;
			Si letras = "LA" Entonces
				LA<-LA+1;
			FinSi
		FinMientras
		Escribir "La partícula LA se repite " LA " vez/veces en la palabra.";
		Leer palabra;
		contador1<-1;
		contador2<-2;
		LA<-0;
	Fin Mientras
FinAlgoritmo