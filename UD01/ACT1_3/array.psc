Algoritmo array
	Escribir "El programa mostrar� los contenidos de un array que introducir� el usuario.";
	Escribir "Introduzca el n�mero de elementos a mostrar.";
	Leer n;
	dimension arr(n);
	Para index<-1 Hasta n Con Paso 1 Hacer
		Escribir "Introduzca el valor de cada elemento (N�mero).";
		Leer v;
		arr(index)<-v;
	FinPara
	Para index2<-1 Hasta n Con Paso 1 Hacer
		Escribir arr(index2);
	FinPara
FinAlgoritmo