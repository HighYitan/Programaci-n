Algoritmo arrayBidimensional
	Escribir "El programa mostrará los contenidos de un array bidimensional creado por el mismo programa, será de dimensiones 4 y 2.";
	Definir columna, fila como entero;
	columna<-4;
	fila<-2;
	dimension arr(columna,fila);
	arr(1,1)=0;
	arr(2,1)=1;
	arr(3,1)=2;
	arr(4,1)=3;
	arr(1,2)=4;
	arr(2,2)=5;
	arr(3,2)=6;
	arr(4,2)=7;
	Para index<-1 Hasta fila Con Paso 1 Hacer
		Para index2<-1 Hasta columna Con Paso 1 Hacer
			Escribir arr(index2, index);
		FinPara
	FinPara
FinAlgoritmo