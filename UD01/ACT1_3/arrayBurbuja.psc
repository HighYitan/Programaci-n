Algoritmo arrayBurbuja
	Escribir "El programa mostrará los contenidos de un array y los ordenará con el algoritmo de la burbuja de menor a mayor.";
	Definir n, guarda como entero;
	n<-10;
	dimension arr(n);
	arr(1)=14;
	arr(2)=99;
	arr(3)=77;
	arr(4)=18;
	arr(5)=66;
	arr(6)=55;
	arr(7)=5;
	arr(8)=88;
	arr(9)=2;
	arr(10)=1;
	Para index<-1 Hasta n-1 Con Paso 1 Hacer
		Para index2<-1 Hasta n-index Con Paso 1 Hacer
			Si arr(index2)>arr(index2+1) Entonces
				guarda<-arr(index2);
				arr(index2)<-arr(index2+1);
				arr(index2+1)<-guarda;
			FinSi
		FinPara
	FinPara
	Para index3<-1 Hasta n Con Paso 1 Hacer
		Escribir arr(index3);
	FinPara
FinAlgoritmo