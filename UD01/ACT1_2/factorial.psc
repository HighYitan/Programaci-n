Algoritmo factorial
	Definir contador_anterior como entero;
	contador_anterior<-1;
	Escribir "Se calcular� el factorial del n�mero que ingrese, introduzca un n�mero.";
	Leer factor;
	Para contador<-2 Hasta factor Con Paso 1 Hacer
		contador_anterior<-contador_anterior*contador;
	FinPara
	Escribir "El factorial de " factor " es igual a " contador_anterior;
FinAlgoritmo