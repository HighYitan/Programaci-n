Algoritmo tablaMultiplicar
	Definir contador como numero;
	contador<-1;
	Escribir "Debe introducirse un número y se le mostrará su tabla de multiplicar hasta el 10, por favor, introduzca el número que desee.";
	Leer num;
	Mientras contador <= 10 Hacer
		Escribir num " x " contador " es igual a " num*contador;
		contador<-contador+1;
	Fin Mientras
FinAlgoritmo