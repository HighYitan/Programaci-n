Algoritmo array
	Escribir "El programa mostrará los contenidos de un array que introducirá el usuario.";
	Escribir "Introduzca el número de elementos a mostrar.";
	Leer n;
	dimension arr(n);
	Para index<-1 Hasta n Con Paso 1 Hacer
		Escribir "Introduzca el valor de cada elemento (Número).";
		Leer v;
		arr(index)<-v;
	FinPara
	Para index2<-1 Hasta n Con Paso 1 Hacer
		Escribir arr(index2);
	FinPara
FinAlgoritmo