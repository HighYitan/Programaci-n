Algoritmo arrayAscDesc
	Escribir "El programa mostrar� los contenidos de un array que introducir� el usuario.";
	Escribir "Introduzca el n�mero de elementos a mostrar.";
	Leer n;
	dimension arr(n);
	Para index<-1 Hasta n Con Paso 1 Hacer
		Escribir "Introduzca el valor de cada elemento (N�mero).";
		Leer v;
		arr(index)<-v;
	FinPara
	Escribir "Diga si quiere verlo en orden ascendente o descendente (Escriba ASC o DESC).";
	Leer orden;
	Si orden == "ASC" Entonces
		Para index2<-1 Hasta n Con Paso 1 Hacer
			Escribir arr(index2);
		FinPara
	SiNo
		Si orden == "DESC" Entonces
			Para index2<-n Hasta n-n+1 Con Paso -1 Hacer
				Escribir arr(index2);
			FinPara
		FinSi
	FinSi
FinAlgoritmo