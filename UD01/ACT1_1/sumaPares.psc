Algoritmo sumaPares
	Escribir "A continuación se mostrará la suma de todos los números pares de 1 a 100:";
	definir contador, n como entero;
	contador<-0;
	n<-0;
	Mientras contador<=100 Hacer
		Si contador%2=0 Entonces
			n<-n+contador;
			Escribir "Contador: " contador " suma del número: " n;
			contador<-contador+1;
		Sino
			Escribir "Impar";
			contador<-contador+1;
		FinSi
	Fin Mientras
	Escribir "La suma total de los pares de 1 a 100 es: " n;
FinAlgoritmo